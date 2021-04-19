package eicoma.com.github.atomicity.practice;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomThreadDemo1 implements Runnable{
    AtomicInteger ac1 = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //通过AtomicInteger类中的incrementAndGet()来保证原子性
            //count++不能保证原子性
            int count = ac1.incrementAndGet();
            System.out.println("莱纳踹了" + count + "道门" );
        }
    }
}
