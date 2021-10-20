package eicoma.com.github.io.practice;

import java.io.*;

/**
 * 转换流和普通字符流的区别是
 * 转换流可以使用指定的字符集进行读写
 * 但普通字符流只能使用默认的字符集进行读写
 * <p>
 * 转换流构造方法
 * <p>
 * InputStreamReader(InputStream in)使用默认字符编码创建InputStreamReader对象
 * InputStreamReader(InputStream in,String chatset)使用指定的字符编码创建InputStreamReader对象
 * OutputStreamWriter(OutputStream out)使用默认字符编码创建OutputStreamWriter对象
 * OutputStreamWriter(OutputStream out,String charset)使用指定的字符编码创建OutputStreamWriter对象
 */

public class ConversionStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //转换流可以使用指定的字符集进行读写
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("io-practice\\six.txt"), "GBK");

        osw.write("闪电五连鞭");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("io-practice\\six.txt"), "GBK");

        int b;
        while ((b = isr.read()) != -1) {
            System.out.println((char) b);
        }
        isr.close();


        //普通的字符流不能使用指定的字符集，他没有这个构造方法
        //普通字符流只能使用默认的字符集

        FileWriter fw = new FileWriter("io-practice\\seven.txt");

        fw.write("马老师发生了甚么事");
        fw.close();

        FileReader fr = new FileReader("io-practice\\seven.txt");

        int c;
        while ((c = fr.read()) != -1) {
            System.out.println((char) c);
        }
        fr.close();
    }
}
