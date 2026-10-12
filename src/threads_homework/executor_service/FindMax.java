package threads_homework.executor_service;
import java.util.List;
import java.util.concurrent.*;


public class FindMax {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> numbers = List.of(5, 20, 8, 45, 3, 17);

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> findMaxTask = () -> {
            int max = numbers.get(0);
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        };

        Future<Integer> futureResult = executor.submit(findMaxTask);

            System.out.println("The largest number is: " + futureResult.get());
            executor.shutdown();
    }
}

