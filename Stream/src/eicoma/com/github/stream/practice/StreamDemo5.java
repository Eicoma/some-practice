package eicoma.com.github.stream.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求：过滤元素并遍历集合
 * 定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
 * 将集合中的奇数删除，只保留整数
 * 遍历集合得到2,4,6,8,10
 */

public class StreamDemo5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        //使用lambda表达式实现流中间操作方法filter()
        list.stream().filter(
                (Integer num) -> {
                    return num % 2 == 0;
                }
        ).forEach(num -> System.out.println(num));

        System.out.println("============================");
        //使用简化的lambda表达式
        list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

        System.out.println("============================");
        //再将集合list里的内容输出
        for (Integer i : list) {
            System.out.println(i);
        }
        //结论：修改流里的内容并不会影响实际的集合里的数据
    }
}
