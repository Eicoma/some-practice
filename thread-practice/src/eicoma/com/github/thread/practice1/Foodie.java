package eicoma.com.github.thread.practice1;

public class Foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                //判断可吃的鱼香肉丝数量
                if (Desk.count == 0) {
                    //count为0，结束循环
                    break;
                } else {
                    if (Desk.flag) {
                        //此时桌子上有鱼香肉丝，吃货线程执行
                        System.out.println("鱼香肉丝真好吃~~");
                        Desk.flag = false;
                        //可吃的鱼香肉丝数量减一
                        Desk.count--;
                        System.out.println("----吃货还能吃" + Desk.count + "盘----");
                        //唤醒厨师线程
                        Desk.lock.notifyAll();
                    } else {
                        //此时桌子上没有鱼香肉丝，吃货线程休眠
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
