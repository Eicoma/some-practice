package eicoma.com.github.io.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader类
 *
 * 提升字符输入流的读取效率
 *
 * 构造方法
 *
 * BufferedReader(Reader in)创建字符缓冲输入流对象
 */


public class BufferedReaderDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("io-practice\\BufferedWriter.txt"));

        char[] charArray = new char[1024];
        int len;
        while((len = br.read(charArray)) != -1){
            System.out.println(new String(charArray,0,len));
        }
        br.close();
    }
}
