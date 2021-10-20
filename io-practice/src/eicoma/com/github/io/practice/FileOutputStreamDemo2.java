package eicoma.com.github.io.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * void   write(int b)将指定的字节写入此文件输出流   一次写一个字节数据
 * void   write(byte[] b)将 b.length字节从指定的字节数组写入此文件输出流   一次写一个字节数组数据
 * void   write(byte[] b, int off, int len)将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流   一次写一个字节数组的部分数据
 */

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("io-practice\\two.txt");
        //这两个创建文件输出流的语句是等效的
        // FileOutputStream的构造方法内部已经调用了File的构造方法
        //FileOutputStream fos = new FileOutputStream(new File("io-practice\\two.txt"))

        ////void write(int b)：将指定的字节写入此文件输出流
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);

        // void write(byte[] b)：将字节从指定的字节数组写入此文件输出流
        //FileOutputStream类下的write()方法只能接受int型参数和字节数组
        //因此若想要将字符串写入文件输出流，则必须通过getBytes()方法将字符串转化为字节数组
        byte[] bys = "abcde".getBytes();
        fos.write(bys);

        //void write(byte[] b, int off, int len)：将字节数组指定长度的字节写入文件输出流
        fos.write(bys, 0, bys.length);
        fos.write(bys, 2, 3);

        //关闭此文件输出流，释放资源
        fos.close();

    }
}
