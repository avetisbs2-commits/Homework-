package threads_homework.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ManyToFew {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task " + finalI + " started by " + threadName);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + finalI + " finished");
            });
        }

        executor.shutdown();
    }
}
