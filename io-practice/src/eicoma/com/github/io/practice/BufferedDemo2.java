package eicoma.com.github.io.practice;

import java.io.*;

/**
 * 通过创建字节数组来提升使用缓冲字节流时的读写速度
 */

public class BufferedDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\BaiduNetdiskDownload\\AE自制特效片段\\星轨.mov"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("io-practice\\星轨(通过字节数组使缓冲字节流提速).mov"));

        /*在底层上，和单字节传输的缓冲字节流不同之处在于
        在内存中字节缓冲输入流的数组与字节缓冲输出流的数组进行字节交换时
        使用的是长度为1024的字节的数组，而不是一个一个字节进行交换
        提升了在内存进行字节交换的效率
         */
        byte[] byteArray = new byte[1024];
        int len;
        while((len = bis.read(byteArray)) != -1){
            bos.write(byteArray,0,len);
        }
        bis.close();
        bos.close();
    }
}
