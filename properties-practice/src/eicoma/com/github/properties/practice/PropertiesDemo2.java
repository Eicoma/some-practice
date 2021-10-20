package eicoma.com.github.properties.practice;

import java.util.Properties;
import java.util.Set;

/**
 * Properties集合特有的方法
 * <p>
 * Object   setProperty(String key, String value)设置集合的键和值，都是String类型，底层调用   Hashtable方法 put
 * String   getProperty(String key)使用此属性列表中指定的键搜索属性
 * Set<String>   stringPropertyNames()从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
 */

public class PropertiesDemo2 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        //Object   setProperty(String key, String value)
        prop.setProperty("月岛希良梨", "宙人");
        prop.setProperty("小樱", "小狼");
        prop.setProperty("越前龙马", "龙崎樱乃");

        //String   getProperty(String key)
        System.out.println(prop.getProperty("月岛希良梨"));
        System.out.println(prop.getProperty("小樱"));
        System.out.println(prop.getProperty("越前龙马"));

        //Set<String>   stringPropertyNames()
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "---" + value);
        }
    }
}
