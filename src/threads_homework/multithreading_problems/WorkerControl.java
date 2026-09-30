package threads_homework.multithreading_problems;

public class WorkerControl {
    volatile static boolean running = true;
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            while (running) {

            }
        });

        worker.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        running = false;

        try {
            worker.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed");
    }
}