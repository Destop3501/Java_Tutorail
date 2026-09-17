
public class ThreadJoin implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new ThreadJoin());
        thread1.start();

        thread1.join();

        System.out.println(thread1.isAlive());
    }

    public void run() {
        System.out.println(Thread.currentThread().isAlive());
    }
}
