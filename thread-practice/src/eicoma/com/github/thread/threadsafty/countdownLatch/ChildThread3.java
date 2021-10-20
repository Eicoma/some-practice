package eicoma.com.github.thread.threadsafty.countdownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch构造方法
 * <p>
 * public CountDownLatch(int count)
 * 参数传递线程数，表示等待线程数量
 * <p>
 * 成员方法
 * <p>
 * public void await()让线程等待
 * public void countDown()当前线程执行完毕
 */

public class ChildThread3 extends Thread {

    private CountDownLatch countDownLatch;

    public ChildThread3(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 18; i++) {
            System.out.println(getName() + "吃了" + i + "个汤圆");
        }
        countDownLatch.countDown();
    }
}
