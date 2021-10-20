package eicoma.com.github.stream.practice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 需求：过滤元素并遍历集合
 * 定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
 * 将集合中的奇数删除，只保留整数
 * 遍历集合得到2,4,6,8,10
 * <p>
 * 对数据使用Stream流的方式操作完毕后,可以把流中的数据收集到集合中
 * <p>
 * public static <T> Collector toList()把元素收集到List集合中
 * public static <T> Collector toSet()把元素收集到Set集合中
 * public static  Collector toMap(Function keyMapper,Function valueMapper)把元素收集到Map集合中
 */

public class StreamDemo6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        list.add(8);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(8);
        //完成对流的过滤，保留偶数,并且使用collect()方法将流中的数据收集，
        // 并用Collectors.toList()创建集合
        //public static <T> Collector toList()把元素收集到List集合中
        List<Integer> list1 = list.stream().filter(
                (Integer integer) -> {
                    return integer % 2 == 0;
                }
        ).collect(Collectors.toList());
        //简化版
        List<Integer> list2 = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());

        //打印集合中的内容
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("==========================");

        //public static <T> Collector toSet()把元素收集到Set集合中
        Set<Integer> set1 = list.stream().filter(
                (Integer integer) -> {
                    return integer % 2 == 0;
                }
        ).collect(Collectors.toSet());

        //简化版
        Set<Integer> set2 = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toSet());

        //输出Set集合中的内容
        System.out.println(set1);
        System.out.println(set2);

        //输出结果显示出了Set集合元素不可重复的特点

        System.out.println("==========================");

        //public static  Collector toMap(Function keyMapper,Function valueMapper)把元素收集到Map集合中
        List<String> list3 = new ArrayList<>();

        list3.add("唐三,18");
        list3.add("小舞,17");
        list3.add("唐昊,48");

        Map<String, String> map = list3.stream().filter(
                //(String s) -> {}  表示s去遍历流中的每一个数据，并在后面的{}中进行处理
                (String s) -> {
                    String[] array = s.split(",");
                    int i = Integer.parseInt(array[1]);
                    return i <= 18;
                }
                //此处要将toMap()方法的参数列表写清楚
        ).collect(Collectors.toMap(
                s -> {
                    return s.split(",")[0];
                },
                s -> {
                    return s.split(",")[1];
                }
        ));
        //输出Map
        System.out.println(map);

    }
}
