package eicoma.com.github.thread.threadsafty.semaphore;

import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable {
    private Semaphore semaphore = new Semaphore(2);

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("获得通行许可");
            Thread.sleep(2000);
            System.out.println("归还通行许可");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
