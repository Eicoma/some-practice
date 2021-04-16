package eicoma.com.github.io.practice;

import java.io.*;

/**
 * 字符缓冲流的特有方法
 *
 * BufferedWriter：
 * void newLine()写一行行分隔符，行分隔符字符串由系统属性定义
 *
 * BufferedReader:
 * String readLine()读一行文字。 结果包含行的内容的字符串，
 * 不包括任何行终止字符如果流的结尾已经到达，则为null
 */

public class BufferedWriterAndReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //使用BufferedWriter类的newLine()方法来进行字符输出流中的换行操作
        BufferedWriter bw = new BufferedWriter(new FileWriter("io-practice\\five.txt"));

        for (int i = 0; i < 5; i++) {
            bw.write("莱纳你坐啊！");
            //换行
            bw.newLine();
            bw.flush();
        }

        bw.close();


        //使用BufferedReader类的方法readLine()读取一行的字符
        //当读取到文件的最后一行字符时，再读下一行时读取到的是null
        BufferedReader br = new BufferedReader(new FileReader("io-practice\\five.txt"));

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
    }
}
