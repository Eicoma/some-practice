package eicoma.com.github.thread.practice2;

import eicoma.com.github.thread.practice1.Desk;

public class Foodie2 extends Thread {
    private Desk2 desk2;

    //创建Foodie2类的带参构造方法
    //传入Desk2类的对象
    //在调用该带参构造方法后，在本类中就能使用Desk2类的对象
    public Foodie2(Desk2 desk2) {
        this.desk2 = desk2;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (desk2.getClock()) {
                //判断可吃的鱼香肉丝数量
                if (desk2.getCount() == 0) {
                    //count为0，结束循环
                    break;
                } else {
                    if (desk2.isFlag()) {
                        //此时桌子上有鱼香肉丝，吃货线程执行
                        System.out.println("鱼香肉丝真好吃~~");
                        desk2.setFlag(false);
                        //可吃的鱼香肉丝数量减一
                        desk2.setCount(desk2.getCount() - 1);
                        System.out.println("----吃货还能吃" + desk2.getCount() + "盘----");
                        //唤醒厨师线程
                        desk2.getClock().notifyAll();
                    } else {
                        //此时桌子上没有鱼香肉丝，吃货线程休眠
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
