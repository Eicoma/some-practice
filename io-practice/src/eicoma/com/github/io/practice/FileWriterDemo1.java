package eicoma.com.github.io.practice;

/**
 * FileWriter类的构造方法
 *
 * FileWriter(File file)根据给定的 File 对象构造一个 FileWriter 对象
 * FileWriter(File file, boolean append)根据给定的 File 对象构造一个 FileWriter 对象
 * FileWriter(String fileName)根据给定的文件名构造一个 FileWriter 对象
 * FileWriter(String fileName, boolean append)根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象
 *
 * 成员方法
 *
 * void   write(int c)写一个字符
 * void   write(char[] cbuf)写入一个字符数组
 * void write(char[] cbuf, int off, int len)写入字符数组的一部分
 * void write(String str)写一个字符串
 * void write(String str, int off, int len)写一个字符串的一部分
 */


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("io-practice\\FileWriterDemo1.txt");

        //void   write(int c)写一个字符
        fw.write(97);
        fw.write(98);
        fw.write(99);
        fw.write(100);
        //在字符输出流中换行
        fw.write("\r\n");

        //void   write(char[] cbuf)写入一个字符数组
        //注意：此处虽然是字符数组
        //但是字符型数据与整型数据之间可以通用
        //整型数据在这里对应字符集中相应的字符
        //允许对整形变量赋予字符值，也允许对字符变量赋整形值
        char[] charArray1 = {97,98,99,100};
        fw.write(charArray1);
        fw.write("\r\n");
        char[] charArray2 = {'a','b','c','d'};
        fw.write(charArray2);
        fw.write("\r\n");

        //void write(char[] cbuf, int off, int len)写入字符数组的一部分
        fw.write(charArray2,0,2);
        fw.write("\r\n");

        //void write(String str)写一个字符串
        fw.write("NetEase");
        fw.write("\r\n");

        //void write(String str, int off, int len)写一个字符串的一部分
        fw.write("NetEase",0,"NetEase".length());
        fw.write("\r\n");


        //关闭字符输出流，释放资源
        fw.close();

    }
}
