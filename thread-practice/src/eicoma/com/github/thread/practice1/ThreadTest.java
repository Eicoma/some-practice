package eicoma.com.github.thread.practice1;

public class ThreadTest {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Foodie foodie = new Foodie();

        //开启两个线程
        cooker.start();
        foodie.start();
    }
}
