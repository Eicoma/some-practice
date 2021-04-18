package eicoma.com.github.thread.practice;

public class Desk {
    //false表示桌子上没有鱼香肉丝，此时吃货休眠，允许厨师线程执行
    //true表示桌子上有鱼香肉丝，此时厨师休眠，允许吃货线程执行
    public static boolean flag = false;
    //可制作的鱼香肉丝的总数
    public static int count = 10;
    //创建一个无法被修改的唯一的对象锁（锁对象）
    public static final Object lock = new Object();
}
