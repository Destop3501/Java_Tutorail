
public class ThreadInitial {

    public static void main(String[] args) {

        Mythread mythread = new Mythread();
        mythread.start();

    }
}

class Mythread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My Thread");
        }
    }
}
