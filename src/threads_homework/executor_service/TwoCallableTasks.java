package threads_homework.executor_service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TwoCallableTasks {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task1 = () -> {
            return 10 + 20;
        };

        Callable<Integer> task2 = () -> {
            return 50 * 5;
        };

        Future<Integer> result1 = executor.submit(task1);
        Future<Integer> result2 = executor.submit(task2);

            System.out.println("First result = " + result1.get());
            System.out.println("Second result = " + result2.get());

            executor.shutdown();
    }
}