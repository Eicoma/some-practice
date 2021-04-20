package eicoma.com.github.thread.threadsafty;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap线程安全
 * 同时效率较高
 *
 * ConcurrentHashMap 在JDK1.7版本底层为数组和链表结构
 *
 * ConcurrentHashMap 在JDK1.8版本底层为数组，链表，红黑树结构
 */

public class ConcurrentHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String,String> hm = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                hm.put(i + "",i + "");
            }
        });

        Thread t2 = new Thread(
                () -> {
                    for (int i = 25; i < 51; i++) {
                        hm.put(i + "",i + "");
                    }
                });

        t1.start();
        t2.start();

        Thread.sleep(1000);

        for (int i = 0; i < 51; i++) {
            System.out.println(hm.get(i + ""));
        }
    }
}
