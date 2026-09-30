package threads_homework.multithreading_problems;

class Wallet {
    int balance = 100;

    private static final Object lock = new Object();
    public void withdraw(int amount) {
        // 1. ПРОВЕРКА (Check)
        synchronized (lock) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " видит, что денег достаточно!");

                try {
                    // Имитируем задержку сети или диска (поток засыпает прямо после проверки)
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 2. ДЕЙСТВИЕ (Act)
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " успешно снял " + amount + ". Остаток: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " — Недостаточно средств!");
            }
        }
    }



    public static void main(String[] args) throws InterruptedException {
        Wallet wallet = new Wallet();

        Thread t1 = new Thread(() -> wallet.withdraw(80), "Thread-1");
        Thread t2 = new Thread(() -> wallet.withdraw(80), "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Итоговый баланс: " + wallet.balance);
    }
}
