package threads_homework.executor_service;

import java.util.concurrent.*;

public class CallableTasks {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> sumTask = () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            return sum;
        };

        Future<Integer> futureResult = executor.submit(sumTask);

            System.out.println("Sum = " + futureResult.get());
            executor.shutdown();
    }
}
