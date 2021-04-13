package eicoma.com.github.hashmap.practice;
/*
需求
- 输入一个字符串,要求统计字符串中每个字符出现的次数。
- 举例: 给定字符串是“aababcabcdabcde”,在控制台输出: “a(5)b(4)c(3)d(2)e(1)”
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("按”1“进行字符数量统计，按“0”退出");
            String choice = sc.next();
            switch (choice) {
                case "0":
                    System.out.println("感谢您的使用！");
                    System.exit(0);
                    break;
                case "1":
                    System.out.println("请输入一个字符串");

                    String s = sc.next();

                    //使用HashMap集合时，访问其元素时时无序的
                    //若想在访问其元素时有序，可使用TreeMap集合
                    //TreeMap用法和HashMap相似，但TreeMap拥有的自然排序可对键进行自然排序，与TreeSet相似
                    //HashMap<Character,Integer> hashMap = new HashMap<>();
                    TreeMap<Character, Integer> hashMap = new TreeMap<>();

                    for (int i = 0; i < s.length(); i++) {
                        if (hashMap.get(s.charAt(i)) == null) {
                            hashMap.put(s.charAt(i), 1);
                        } else {
                            hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
                        }
                    }

                    Set<Character> set = hashMap.keySet();
                    for (Character c : set) {
                        System.out.print(c + "(" + hashMap.get(c) + ")");
                    }
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }
    }
}
