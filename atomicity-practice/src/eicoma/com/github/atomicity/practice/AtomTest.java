package eicoma.com.github.atomicity.practice;

public class AtomTest {
    public static void main(String[] args) {
        AtomThreadDemo1 atd = new AtomThreadDemo1();

        // 创建100个线程
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(atd);
            thread.start();
        }
    }
}
