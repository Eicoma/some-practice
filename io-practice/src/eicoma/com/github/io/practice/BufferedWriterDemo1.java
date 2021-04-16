package eicoma.com.github.io.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter类
 *
 * 提升字符输出流的写入效率
 *
 * 构造方法
 *
 * BufferedWriter(Writer out)创建字符缓冲输出流对象
 */

public class BufferedWriterDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("io-practice\\BufferedWriter.txt"));

        bw.write(97);
        bw.write("\r\n");

        bw.write("lainanizuoa");
        bw.write("\r\n");

        String s = "lainanizuoa";
        bw.write(s,0,5);
        bw.write("\r\n");

        char[] charArray = {97,98,99};
        bw.write(charArray);
        bw.write("\r\n");

        bw.write(charArray,0,2);
        bw.write("\r\n");

        bw.flush();

        bw.close();



    }
}
