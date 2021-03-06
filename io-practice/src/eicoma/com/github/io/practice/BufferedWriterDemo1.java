package eicoma.com.github.io.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter类
 * <p>
 * 提升字符输出流的写入效率
 * <p>
 * 构造方法
 * <p>
 * BufferedWriter(Writer out)创建字符缓冲输出流对象
 */

public class BufferedWriterDemo1 {
    public static void main(String[] args) throws IOException {
        //io-practice表示的是我要写入的这个文件在当前模块（module）下
        BufferedWriter bw = new BufferedWriter(new FileWriter("io-practice\\BufferedWriter.txt"));

        bw.write(97);
        //换行
        bw.write("\r\n");

        bw.write("lainanizuoa");
        bw.write("\r\n");

        String s = "lainanizuoa";
        bw.write(s, 0, 5);
        bw.write("\r\n");

        char[] charArray = {97, 98, 99};
        bw.write(charArray);
        bw.write("\r\n");

        bw.write(charArray, 0, 2);
        bw.write("\r\n");

        bw.flush();

        bw.close();


    }
}
