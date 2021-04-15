package eicoma.com.github.io.practice;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建文件输出流，并指定文件的名称
        FileOutputStream fos = new FileOutputStream("io-practice\\one.txt");
        //将指定的字节写入此文件输出流
        //byte[] byteArray = {1,2,3};
        //fos.write(byteArray);
        fos.write(99);

        //写入结束后，关闭该文件输出流，释放资源
        fos.close();
    }
}
