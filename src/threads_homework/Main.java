package threads_homework;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MessageThread messageThread = new MessageThread();
        messageThread.start();

        Thread thread1 = new Thread(() -> {for (int i = 1 ; i <= 5 ; i++)
            System.out.println(i);});

        Thread thread2 = new Thread(() -> {for (int i = 1 ; i <= 15 ; i++)
            System.out.println(i);});

        thread1.start();
        thread2.start();

        Thread thread = new Thread(new DownloadTask());
        thread.start();

        Thread preparationThread = new Thread(new PreparationThread());
        Thread workThread = new Thread(new WorkThread());
        preparationThread.start();
        preparationThread.join();
        workThread.start();

        System.out.println("Current thread: " + Thread.currentThread().getName());

        Thread thread6 = new Thread(() -> System.out.println("Current thread: " + Thread.currentThread().getName()));
        Thread thread7 = new Thread(() -> System.out.println("Current thread: " + Thread.currentThread().getName()));
        Thread thread8 = new Thread(() -> System.out.println("Current thread: " + Thread.currentThread().getName()));
        thread6.start();
        thread7.start();
        thread8.start();

        Thread taskThread = new Thread(() -> {
            System.out.println("Task started");
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Task finished");
        });

        System.out.println("1. Before start(): " + taskThread.getState());

        taskThread.start();
        System.out.println("2. After start(): " + taskThread.getState());

        Thread.sleep(500);
        System.out.println("3. While sleeping: " + taskThread.getState());

        taskThread.join();
        System.out.println("4. After join(): " + taskThread.getState());


        Thread thread3 = new Thread(new MyRunnable());
        thread3.start();


        Thread t  = new Thread(() -> {for (int i = 1 ; i <= 5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        });

        t.start();
        t.join();
        System.out.println("Main");



        Thread t1  = new Thread(() -> {for (int i = 1 ; i <= 3 ; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        });

        Thread t2  = new Thread(() -> {for (int i = 1 ; i <= 3 ; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        });

        Thread t3  = new Thread(() -> {for (int i = 1 ; i <= 3 ; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(666);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        });

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        System.out.println("All threads finished");
    }
}
