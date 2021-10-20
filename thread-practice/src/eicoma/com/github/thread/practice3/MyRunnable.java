package eicoma.com.github.thread.practice3;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "我在执行");
    }
}
