package eicoma.com.github.hashmap.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();

        arrayList1.add("阿修罗");
        arrayList1.add("大暗黑天");
        arrayList2.add("狂战士");
        arrayList2.add("狱血魔神");
        arrayList3.add("剑圣");
        arrayList3.add("剑神");

        hashMap.put("暗天波动眼",arrayList1);
        hashMap.put("魔狱血刹",arrayList2);
        hashMap.put("极鬼剑术·暴风式",arrayList3);

        //获取到键的集合
        Set<String> set = hashMap.keySet();
        //遍历键集合，获取到每一个键
        for(String key : set){
            System.out.println(key);
            ArrayList<String> arrayList = hashMap.get(key);
            for(String s : arrayList){
                System.out.println(s);
            }
        }
    }
}
