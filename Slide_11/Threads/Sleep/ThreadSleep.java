
public class ThreadSleep implements Runnable {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ThreadSleep());
        thread1.start();

        Thread thread2 = new Thread(new ThreadSleep());
        thread2.start();
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
