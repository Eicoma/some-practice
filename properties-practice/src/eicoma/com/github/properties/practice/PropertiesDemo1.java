package eicoma.com.github.properties.practice;

import java.util.Properties;
import java.util.Set;

/**
 * Properties介绍
 *
 * - 是一个Map体系的集合类
 * - Properties可以保存到流中或从流中加载
 * - 属性列表中的每个键及其对应的值都是一个字符串
 *
 * Properties集合的基本使用
 */

public class PropertiesDemo1 {
    public static void main(String[] args) {
        //注意 Properties集合在创建对象时不需要对其泛型进行定义
        //Properties<String,String> prop = new Properties<String,String>(); 这样创建对象时错误的
        Properties prop = new Properties();

        //存储元素到Properties集合中
        prop.put("莱纳布朗","门之巨人");
        prop.put("贝尔托尔特","超大巨人");
        prop.put("阿尼","女巨");

        Set<Object> set = prop.keySet();
        for (Object key : set){
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
