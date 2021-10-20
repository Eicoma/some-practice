package eicoma.com.github.thread.threadsafty.semaphore;


public class SemaphoreTest {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(myRunnable);
            thread.start();
        }
    }
}

