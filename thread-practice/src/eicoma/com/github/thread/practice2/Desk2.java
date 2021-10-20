package eicoma.com.github.thread.practice2;

public class Desk2 {
    //false表示桌子上没有鱼香肉丝，此时吃货休眠，允许厨师线程执行
    //true表示桌子上有鱼香肉丝，此时厨师休眠，允许吃货线程执行
    //public static boolean flag = false;
    private boolean flag;

    //可制作的鱼香肉丝的总数
    //public static int count = 10;
    private int count;

    //创建一个无法被修改的唯一的对象锁（锁对象）
    //public static final Object lock = new Object();
    private final Object clock = new Object();

    public Desk2() {
        //此处在空参构造方法内通过this关键字调用本类的带参构造方法
        //对本类的两个成员变量赋值
        this(false, 10);
    }

    public Desk2(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getClock() {
        return clock;
    }

    @Override
    public String toString() {
        return "Desk2{" +
                "flag=" + flag +
                ", count=" + count +
                ", clock=" + clock +
                '}';
    }
}
