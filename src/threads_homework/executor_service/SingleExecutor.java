package threads_homework.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            System.out.println("Task 1 " + Thread.currentThread().getName());
        });

        executor.submit(() -> {
            System.out.println("Task 2 " + Thread.currentThread().getName());
        });

        executor.submit(() -> {
            System.out.println("Task 3 " + Thread.currentThread().getName());
        });

        executor.submit(() -> {
            System.out.println("Task 4 " + Thread.currentThread().getName());
        });
        executor.submit(() -> {
            System.out.println("Task 5 " + Thread.currentThread().getName());
        });
    }

}
