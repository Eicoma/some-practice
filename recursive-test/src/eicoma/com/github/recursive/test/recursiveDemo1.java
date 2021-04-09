package eicoma.com.github.recursive.test;

public class recursiveDemo1 {
    public static void main(String[] args) {
        int result = getJc(5);
        System.out.println(result);
    }

    //使用递归实现阶乘
    public static int getJc(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * getJc(--i);
            //return i * getJc(i - 1);
        }
    }
}
