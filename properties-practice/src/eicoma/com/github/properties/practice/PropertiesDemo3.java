package eicoma.com.github.properties.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties集合与IO流相结合的方法
 *
 * void   load(Reader reader)从输入字符流读取属性列表（键和元素对）
 * void   store(Writer writer, String comments)将此属性列表（键和元素对）写入此   Properties表中，
 * 以适合使用   load(Reader)方法的格式写入输出字符流
 */

public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("properties-practice\\one.properties");
        //void   load(Reader reader)
        //这里通过load()方法，其实已经将该 键值对数据读入了prop集合对象中
        prop.load(fr);
        fr.close();
        System.out.println(prop);

        //void   store(Writer writer, String comments)
        //Properties prop2 = new Properties();
        prop.setProperty("user1","12350");
        prop.setProperty("user2","55565");
        prop.setProperty("user3","54897");

        FileWriter fw = new FileWriter("properties-practice\\one.txt");
        prop.store(fw,null);
        fw.close();
    }
}
