package threads_homework.multithreading_problems;

public class ScoreCounter {
    int score = 0;

    public synchronized void increase() {
        score++;
    }

    public static void main(String[] args) throws InterruptedException {
        ScoreCounter counter = new ScoreCounter();

        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increase();
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(counter.score);
    }
}