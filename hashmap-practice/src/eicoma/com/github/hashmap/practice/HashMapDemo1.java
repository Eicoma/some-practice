package eicoma.com.github.hashmap.practice;
/**
 * ArrayList集合存储HashMap集合元素并遍历
 */

import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String, String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();

        hashMap1.put("唐三", "小舞");
        hashMap1.put("奥斯卡", "宁荣荣");
        hashMap1.put("戴沐白", "朱竹清");
        hashMap1.put("马红俊", "白沉香");

        hashMap2.put("蓝银草", "柔骨兔");
        hashMap2.put("香肠", "七宝琉璃塔");
        hashMap2.put("白虎", "幽冥灵猫");
        hashMap2.put("草鸡", "仙鹤");

        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

        arrayList.add(hashMap1);
        arrayList.add(hashMap2);

        //此处先遍历ArrayList集合获取到每一个HashMap集合
        for (HashMap<String, String> hashMaps : arrayList) {
            //获取到HashMap集合后，通过HashMap调用keySet()方法获取到键的集合并存入Set集合
            Set<String> set = hashMaps.keySet();
            //遍历Set集合并获取到每一个键值
            for (String key : set) {
                //通过HashMap调用get()方法获取到键对应的值
                String value = hashMaps.get(key);
                System.out.println(key + "\t" + value);
            }
        }
    }
}
