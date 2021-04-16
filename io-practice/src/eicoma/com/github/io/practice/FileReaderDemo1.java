package eicoma.com.github.io.practice;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader类的构造方法
 *
 * FileReader(File file)传入一个File对象，创建一个新 FileReader
 * FileReader(String fileName)传入一个目录的路径，创建一个新 FileReader
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

//        int b;
//        while((b = fr.read())!= -1){
//            System.out.print((char)b);
//        }

        //int read(char[] cbuf)一次读一个字符数组数据
        //表示读取字符时一次性读取1024个字符，并存入字符数组中
        char[] charArray = new char[1024];
        //len表示当前读取到的字符数目
        int len;
        while((len = fr.read(charArray)) != -1){
            //该String的构造方法是将字符数组从0索引开始，长度为len的字符转化为字符串对象
            System.out.print(new String(charArray,0,len));
        }

        fr.close();
    }
}
