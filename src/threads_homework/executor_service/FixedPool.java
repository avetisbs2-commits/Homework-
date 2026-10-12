package threads_homework.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(3);

        executors.submit(() -> {
            System.out.println("Task 1 " + Thread.currentThread().getName());
        });

        Thread.sleep(1000);


        executors.submit(() -> {
            System.out.println("Task 2 " + Thread.currentThread().getName());
        });

        Thread.sleep(1000);
        executors.submit(() -> {
            System.out.println("Task 3 " + Thread.currentThread().getName());
        });

        Thread.sleep(1000);
        executors.submit(() -> {
            System.out.println("Task 4 " + Thread.currentThread().getName());
        });

        executors.submit(() -> {
            System.out.println("Task 5 " + Thread.currentThread().getName());
        });
        Thread.sleep(1000);
        executors.submit(() -> {
            System.out.println("Task 6 " + Thread.currentThread().getName());
        });

        executors.shutdown();
    }
}
