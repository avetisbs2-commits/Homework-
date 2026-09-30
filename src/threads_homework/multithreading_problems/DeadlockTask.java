package threads_homework.multithreading_problems;

public class DeadlockTask {
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            synchronized (lockA) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lockB) {
                    System.out.println(21);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lockB) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lockA) {
                    System.out.println(21);

                }
            }
        });

        t1.start();
        t2.start();
    }
}