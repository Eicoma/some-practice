package eicoma.com.github.io.practice;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流
 * <p>
 * - FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream
 * 该文件由文件系统中的路径名name命名
 * <p>
 * 字节输入流读取数据的步骤
 * <p>
 * - 创建字节输入流对象
 * - 调用字节输入流对象的读数据方法
 * - 释放资源
 */

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("io-practice\\four.txt");
        //字节输入流读取的是字节，但在返回值时将其提升为int型
        //是为了避免在读到连续8个1时，而8个1的十进制正好是-1，
        // 这就和结束标志那个-1冲突了，就会出现有可能还没读完但是由于你返回-1了导致结束了
        int byt;
        //通过while循环，对读取的字节进行非-1的判断
        //若读取到的字节为-1则停止读取
        while ((byt = fis.read()) != -1) {
            System.out.print((char) byt);
        }
        fis.close();
    }
}
