package threads_homework.executor_service;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorCheck {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            System.out.println("Task started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task finished");
        });
        System.out.println("isShutdown: " + executor.isShutdown());
        System.out.println("isTerminated: " + executor.isTerminated());
        Thread.sleep(5000);
        executor.shutdown();


        System.out.println("isShutdown: " + executor.isShutdown());
        System.out.println("isTerminated: " + executor.isTerminated());

    }
}