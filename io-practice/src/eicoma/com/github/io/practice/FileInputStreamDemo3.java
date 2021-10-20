package eicoma.com.github.io.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过字节数组来提高读取和写入的速度
 * <p>
 * 一次读一个字节数组的方法
 * <p>
 * - public int read(byte[] b)：从输入流读取最多b.length个字节的数据
 * - 返回的是读入缓冲区的总字节数,也就是实际的读取字节个数
 */

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\BaiduNetdiskDownload\\AE自制特效片段\\星轨.mov");
        FileOutputStream fos = new FileOutputStream("io-practice\\星轨(通过字节数组提速).mov");

        byte[] byteArray = new byte[1024];
        int len;
        while ((len = fis.read(byteArray)) != -1) {
            //0为从字节数组下标为0的位置开始写
            //len为当前这次读取到的字节个数并将其写入输出流
            fos.write(byteArray, 0, len);
        }
        fis.close();
        fos.close();
        //读写速度UP!!!!!!!!
    }
}
