package eicoma.com.github.thread.practice2;

import eicoma.com.github.thread.practice1.Desk;

public class Cooker2 extends Thread {
    private Desk2 desk2;

    //  创建Cooker2类的带参构造方法
    //    //传入Desk2类的对象
    //    //在调用该带参构造方法后，在本类中就能使用Desk2类的对象
    public Cooker2(Desk2 desk2) {
        this.desk2 = desk2;
    }

    @Override
    public void run() {
        while (true) {
            if (desk2.getCount() == 0) {
                //此时吃货吃不下了，跳出循环
                break;
            } else {
                synchronized (desk2.getClock()) {
                    if (!desk2.isFlag()) {
                        //桌子上没有鱼香肉丝，允许生产
                        System.out.println("开始炒鱼香肉丝~~");
                        //桌子上有了鱼香肉丝
                        desk2.setFlag(true);
                        //唤醒吃货线程
                        desk2.getClock().notifyAll();
                    } else {
                        //桌子上有鱼香肉丝，厨师线程休眠
                        try {
                            desk2.getClock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
