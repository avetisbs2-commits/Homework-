package threads_homework;

public class MessageThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from thread");
    }
}
