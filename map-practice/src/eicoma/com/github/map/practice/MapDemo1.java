package eicoma.com.github.map.practice;
/**
 * Map接口（实现类HashMap）中的常用方法
 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();

        //V   put(K key,V   value)添加元素
        map.put("qiumin",35);
        map.put("huangjing",38);
        map.put("tanqun",34);
        map.put("zuozhongzhi",33);

        //V   put(K key,V   value)添加元素
        // V   remove(Object key)根据键删除键值对元素
        // void   clear()移除所有的键值对元素
        // boolean containsKey(Object key)判断集合是否包含指定的键
        // boolean containsValue(Object value)判断集合是否包含指定的值
        // boolean isEmpty()判断集合是否为空
        // int size()集合的长度，也就是集合中键值对的个数


        // V   remove(Object key)根据键删除键值对元素
        System.out.println(map.remove("qiumin"));
        System.out.println(map);

        // void   clear()移除所有的键值对元素
//        map.clear();
//        System.out.println(map);

        // boolean containsKey(Object key)判断集合是否包含指定的键
        System.out.println(map.containsKey("zuozhongzhi"));

        // boolean containsValue(Object value)判断集合是否包含指定的值
        System.out.println(map.containsValue(33));

        // boolean isEmpty()判断集合是否为空
        System.out.println(map.isEmpty());

        // int size()集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());

        System.out.println("==========================");

        //V   get(Object key)根据键获取值
        // Set<K>   keySet()获取所有键的集合
        // Collection<V>   values()获取所有值的集合
        // Set<Map.Entry<K,V>>   entrySet()获取所有键值对对象的集合

        //V   get(Object key)根据键获取值
        System.out.println(map.get("tanqun"));

        // Set<K>   keySet()获取所有键的集合
        System.out.println(map.keySet());

        // Collection<V>   values()获取所有值的集合
        System.out.println(map.values());

        // Set<Map.Entry<K,V>>   entrySet()获取所有键值对对象的集合
        //该方法返回的是一个包含着键值对的Set集合
        System.out.println(map.entrySet());

    }
}
