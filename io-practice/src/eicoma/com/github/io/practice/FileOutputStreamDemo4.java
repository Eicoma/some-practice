package eicoma.com.github.io.practice;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流中的异常处理
 */

public class FileOutputStreamDemo4 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //System.out.println(2/0);
            fos = new FileOutputStream("io-practice\\three.txt");
            fos.write("Show it for me".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //fos.close()放在finally中是为了让其一定能执行，避免因异常而未运行该语句导致资源未释放
            //在这里对fos进行非空判断的原因是
            //如果前边在对fos赋地址前就因异常而停止了，就会导致fos调用其方法时出现空指针异常
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
