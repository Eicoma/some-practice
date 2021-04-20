package eicoma.com.github.thread.threadsafty.countdownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        MotherThread motherThread = new MotherThread(countDownLatch);
        motherThread.start();

        ChildThread1 childThread1 = new ChildThread1(countDownLatch);
        childThread1.setName("喜洋洋");
        childThread1.start();

        ChildThread2 childThread2 = new ChildThread2(countDownLatch);
        childThread2.setName("美羊羊");
        childThread2.start();

        ChildThread3 childThread3 = new ChildThread3(countDownLatch);
        childThread3.setName("沸羊羊");
        childThread3.start();
    }
}
