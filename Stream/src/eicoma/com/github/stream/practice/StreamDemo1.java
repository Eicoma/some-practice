package eicoma.com.github.stream.practice;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //单列集合使用Stream流
        //List集合使用Stream流
        List<String> list = new ArrayList<>();

        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        //第一种形式
        //用Stream类型的变量去调用forEach()方法
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));

        //第二种形式
        //直接让集合对象去调用stream()和forEach()方法
        list.stream().forEach(s -> System.out.println(s));
        //Set集合使用Stream生成流
        Set<String> set = new HashSet<>();

        set.add("tanqun");
        set.add("zuozhongtang");
        set.add("lihongzhang");

        set.stream().forEach(s -> System.out.println(s));

        System.out.println("============================");
        //双列集合使用Stream生成流
        Map<String, String> map = new HashMap<>();

        map.put("qiumin", "38");
        map.put("huangjing", "40");
        map.put("zuozhongzhi", "42");

        map.keySet().stream().forEach(s -> System.out.println(s));
        map.values().stream().forEach(s -> System.out.println(s));
        map.entrySet().stream().forEach(s -> System.out.println(s));

        System.out.println("============================");
        //数组使用Stream生成流
        int[] array = {11, 22, 33, 44, 55, 66};
        Arrays.stream(array).forEach(s -> System.out.println(s));

        String[] array2 = {"1", "2", "3"};
        Stream<String> stream1 = Arrays.stream(array2);
        stream1.forEach(s -> System.out.println(s));

        System.out.println("============================");
        //同种数据类型的多个数据可以通过Stream接口的静态方法of(T... values)生成流
        Stream.of(1, 2, 3, 4, 5, 6, 7).forEach(s -> System.out.print(s));
        System.out.println();
        Stream.of("1", "2", "3", "4", "5").forEach(s -> System.out.print(s));

    }
}
