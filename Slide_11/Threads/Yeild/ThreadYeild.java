
public class ThreadYeild implements Runnable {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ThreadYeild());
        Thread thread2 = new Thread(new ThreadYeild());

        thread1.start();
        thread2.start();

    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        Thread.yield();
        System.out.println(Thread.currentThread().getName());
    }
}
