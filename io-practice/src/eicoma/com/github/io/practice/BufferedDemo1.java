package eicoma.com.github.io.practice;

import java.io.*;

/**
 * 使用字节缓冲流提升读写效率
 *
 * BufferedOutputStream(OutputStream out)创建字节缓冲输出流对象
 * BufferedInputStream(InputStream in)创建字节缓冲输入流对象
 */

public class BufferedDemo1 {
    public static void main(String[] args) throws IOException{
        //创建字节缓冲流对象，参数传入文件输入输出流对象
        //真正的读写依旧是字节流（文件输入输出流）
        //缓冲流使读写过程提速
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\BaiduNetdiskDownload\\AE自制特效片段\\星轨.mov"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("io-practice\\星轨(通过字节缓冲流提速).mov"));

        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
