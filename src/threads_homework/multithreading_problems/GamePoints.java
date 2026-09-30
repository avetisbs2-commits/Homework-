package threads_homework.multithreading_problems;

public class GamePoints {
    int points = 100;
    public synchronized void addPoints(){
        points =+ 10;
    }

    public synchronized void removePoints(){
        points =- 10;
    }
    public static void main(String[] args) throws InterruptedException {
        GamePoints game = new GamePoints();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                game.addPoints();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                game.removePoints();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(game.points);
    }
}