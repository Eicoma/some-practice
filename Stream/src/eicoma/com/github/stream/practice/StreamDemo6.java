package eicoma.com.github.stream.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *  需求：过滤元素并遍历集合
 *  定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
 *  将集合中的奇数删除，只保留整数
 *  遍历集合得到2,4,6,8,10
 *
 *  对数据使用Stream流的方式操作完毕后,可以把流中的数据收集到集合中
 *
 * public static <T> Collector toList()把元素收集到List集合中
 *  public static <T> Collector toSet()把元素收集到Set集合中
 *  public static  Collector toMap(Function keyMapper,Function valueMapper)把元素收集到Map集合中
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
                    return integer % 2 ==0;
                }
        ).collect(Collectors.toList());
        //简化版
        List<Integer> list2 = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());

        //打印集合中的内容
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("==========================");


        Set<Integer> set1 = list.stream().filter(
                (Integer integer) -> {
                    return integer % 2 == 0;
                }
        ).collect(Collectors.toSet());

        //简化版
        Set<Integer> set2 = list.stream().filter(
                (Integer integer) -> {
                    return integer % 2 == 0;
                }
        ).collect(Collectors.toSet());

        //输出Set集合中的内容
        System.out.println(set1);
        System.out.println(set2);

        //输出结果显示出了Set集合元素不可重复的特点
    }
}
