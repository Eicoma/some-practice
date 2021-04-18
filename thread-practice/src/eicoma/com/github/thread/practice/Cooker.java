package eicoma.com.github.thread.practice;

public class Cooker extends Thread{
    @Override
    public void run() {
        while(true){
            if(Desk.count == 0){
                //此时吃货吃不下了，跳出循环
                break;
            }else{
                synchronized(Desk.lock){
                    if (!Desk.flag){
                        //桌子上没有鱼香肉丝，允许生产
                        System.out.println("开始炒鱼香肉丝~~");
                        //桌子上有了鱼香肉丝
                        Desk.flag = true;
                        //唤醒吃货线程
                        Desk.lock.notifyAll();
                    }else{
                        //桌子上有鱼香肉丝，厨师线程休眠
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
