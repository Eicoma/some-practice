package eicoma.com.github.io.practice;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;

/**
 * 案例需求
 *
 * 使用字符缓冲流读取文件中的数据，排序后再次写到本地文件
 *
 * 实现步骤
 *
 * - 将文件中的数据读取到程序中
 * - 对读取到的数据进行处理
 * - 将处理后的数据添加到集合中
 * - 对集合中的数据进行排序
 * - 将排序后的集合中的数据写入到文件中
 */

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("io-practice\\numbers.txt"));

        //读取到文件中那一行数据后，关闭字符缓冲输入流
        String line = br.readLine();
        br.close();

        //根据空格分割字符串并返回一个字符串数组
        String[] strArray = line.split(" ");
        //根据字符串数组的长度定义一个长度相同的整形数组
        int[] intArray = new int[strArray.length];
        //通过for循环遍历每一个字符串并将其类型转化为Int型并存入Int数组
        for(int i = 0 ; i< strArray.length;i++ ){
            String s = strArray[i];
            int num = Integer.parseInt(s);
            intArray[i] = num;
        }

        //调用sort()对整形数组进行排序
        System.out.println("读取到的数据为" + Arrays.toString(intArray));
        Arrays.sort(intArray);


        //创建字符字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("io-practice\\sort.txt"));

        //通过fot循环将int数组中的元素写入目标文件
        for (int i = 0; i < intArray.length; i++) {
            bw.write(intArray[i] +" ");
        }
        bw.flush();
        bw.close();
    }
}
