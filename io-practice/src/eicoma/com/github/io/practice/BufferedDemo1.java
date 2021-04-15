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
        //字节缓冲流在底层实际上也是创建了字节数组（该数组的长度为8192）

        /*在底层（数据源硬盘到内存再到目标硬盘）
        read()从数据源硬盘直接读取8192个字节，存储到内存中的字节缓冲输入流创建的字节数组中
        再将该字节数组中的元素一个一个地传入内存中的字节缓冲输出流创建的字节数组中
        最后再通过write()方法将这个数组直接写入到目标硬盘中，极大地节约了读写时间
        因为内存的运行速度比硬盘要快很多！！
         */
        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
