package eicoma.com.github.thread.practice4;

public class ThreadSleepTest {
    public static void main(String[] args) throws InterruptedException{
             /*System.out.println("睡觉前");
        Thread.sleep(3000);
        System.out.println("睡醒了");*/

        ThreadSleep ts = new ThreadSleep();

        Thread t1 = new Thread(ts);
        Thread t2 = new Thread(ts);

        t1.start();
        t2.start();
    }
}

