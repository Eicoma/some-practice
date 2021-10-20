package eicoma.com.github.io.practice;

/**
 * 先使用文件输入流读取一个mov文件
 * 再使用文件输出流将该文件写到本模块目录下
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\BaiduNetdiskDownload\\AE自制特效片段\\星轨.mov");
        FileOutputStream fos = new FileOutputStream("io-practice\\星轨.mov");

        int byt;
        //该种读取为一次读取一个字节
        while ((byt = fis.read()) != -1) {
            fos.write(byt);
        }
        fis.close();
        fos.close();
        //读写速度太慢了
    }
}
