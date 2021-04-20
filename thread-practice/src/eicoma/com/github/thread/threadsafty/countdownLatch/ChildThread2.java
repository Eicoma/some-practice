package eicoma.com.github.thread.threadsafty.countdownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch构造方法
 *
 * public CountDownLatch(int count)
 * 参数传递线程数，表示等待线程数量
 *
 *成员方法
 *
 * public void await()让线程等待
 * public void countDown()当前线程执行完毕
 */

public class ChildThread2 extends Thread{

    private CountDownLatch countDownLatch;
    public ChildThread2(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 30; i++) {
            System.out.println(getName() + "吃了" + i +"个汤圆");
        }
        countDownLatch.countDown();
    }
}
