package eicoma.com.github.thread.practice2;

public class ThreadTest2 {
    public static void main(String[] args) {
        //创建Desk2类的对象，调用其空参构造方法
        Desk2 desk2 = new Desk2();

        //创两个线程类的对象，同时调用其带参构造
        //将Desk2类的对象desk2传入，使在这两个线程类中能通过Desk2类对象调用Desk2类中的方法
        Cooker2 cooker2 = new Cooker2(desk2);
        Foodie2 foodie2 = new Foodie2(desk2);


        //开启两个线程
        cooker2.start();
        foodie2.start();
    }
}
