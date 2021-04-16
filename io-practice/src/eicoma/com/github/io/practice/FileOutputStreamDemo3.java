package eicoma.com.github.io.practice;

/**
 * 字节流写数据如何实现换行
 *
 * - windows:\r\n
 * - linux:\n
 * - mac:\r
 *
 * 字节流写数据如何实现追加写入
 *
 * - public FileOutputStream(String name,boolean append)
 * - FileOutputStream的构造方法的第二个参数若为true,则可以对该文件进行续写
 * 若不添加该boolean参数，则默认为false，即在使用该文件输出流时，覆盖之前已写入的内容
 */

import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //更改默认的boolean参数为true
        FileOutputStream fos = new FileOutputStream("io-practice\\two.txt",true);

        fos.write("\r\n".getBytes());
        //在文件输出流中换行
        fos.write(97);
        fos.write("\r\n".getBytes());
        fos.write(98);
        fos.write("\r\n".getBytes());
        fos.write(99);
        fos.write("\r\n".getBytes());
        fos.write(100);
        fos.write("\r\n".getBytes());
        fos.write(101);
        fos.write("\r\n".getBytes());

        //关闭此文件输出流，释放资源
        fos.close();

    }
}
