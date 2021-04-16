package eicoma.com.github.io.practice;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader类的构造方法
 *
 * FileReader(File file)在给定从中读取数据的 File 的情况下创建一个新 FileReader
 * FileReader(String fileName)在给定从中读取数据的文件名的情况下创建一个新 FileReader
 *
 * 成员方法
 *
 * int read()一次读一个字符数据
 * int read(char[] cbuf)一次读一个字符数组数据
 */

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //int read()一次读一个字符数据
        FileReader fr = new FileReader("io-practice\\four.txt");

        int b;
        while((b = fr.read())!= -1){
            System.out.print((char)b);
        }

        //

        fr.close();
    }
}
