package threads_homework.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTasks {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable firstTask = () -> {
            for(int i = 1 ; i <= 5 ; i++){
                System.out.println(i + Thread.currentThread().getName() );
            }
        };



        Runnable secondTask = () -> {
            for(char i = 'A' ; i <= 'E' ; i++){
                System.out.println(i + Thread.currentThread().getName());
            }
        };



        Runnable thirdTask = () -> {
            for(int i = 1 ; i <= 5 ; i++){
                System.out.println("Hello" + Thread.currentThread().getName());
            }
        };


        executor.submit(firstTask);
        Thread.sleep(1000);
        executor.submit(secondTask);
        Thread.sleep(1000);
        executor.submit(thirdTask);

        executor.shutdown();
    }
}
