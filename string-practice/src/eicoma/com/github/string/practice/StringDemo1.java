package eicoma.com.github.string.practice;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 字符串中的编码解码问题
 *
 * byte[] getBytes()使用默认的字符集将该 字符串编码为一系列字节并返回一个字节数组
 * byte[] getBytes(String charsetName)使用自己指定的字符集将 字符串编码为一系列字节并返回一个字节数组
 * String(byte[] bytes)使用平台的默认字符集将传入的字节数组解码来创建字符串
 * String(byte[] bytes, String charsetName)通过自己指定的字符集来将传入的字节数组解码来创建字符串
 */

public class StringDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "网易";

        //byte[] getBytes() 采用默认字符集UTF-8编码
        byte[] bytesArray1 = s.getBytes();
        System.out.println(Arrays.toString(bytesArray1));
        //输出 [-25, -67, -111, -26, -104, -109]

        //byte[] getBytes(String charsetName) 采用指定字符集进行编码
        byte[] bytesArray2 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytesArray2));
        //输出 [-51, -8, -46, -41]

        //String(byte[] bytes) 采用默认字符集UTF-8进行解码
        //String(byte[] bytes, String charsetName) 采用指定字符集进行解码
        String name1 = new String(bytesArray1);
        System.out.println(name1);
        //输出 网易
        String name2 = new String(bytesArray1,"GBK");
        System.out.println(name2);
        //输出 缃戞槗 （乱码）
        String name3 = new String(bytesArray2);
        System.out.println(name3);
        //输出 ���� （乱码）

        String name4 = new String(bytesArray2,"GBK");
        System.out.println(name4);
        //输出 网易

        /*
        由此可以得出
        采用不同字符集编码得到的字节数组不能采用不同的字符集进行解码
        例如采用UTF-8编码得到的字节数组bytesArray1不能用GBK字符集进行解码
        否则就会输出乱码
        因为UTF-8字符集中，一个中文汉字对应三个字节
        而在GBK字符集中，一个中文汉字对应两个字节，两个字符集是完全不同的
        因此只能用唯一的字符集去编码和解码
         */


    }
}
