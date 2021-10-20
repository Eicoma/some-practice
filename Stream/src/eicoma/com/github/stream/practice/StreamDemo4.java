package eicoma.com.github.stream.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Stream流终结操作方法
 * void forEach(Consumer action)对此流的每个元素执行操作
 * long count()返回此流中的元素数
 */

public class StreamDemo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
//         void forEach(Consumer action)对此流的每个元素执行操作
        //第一种形式，匿名内部类
        list.stream().forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }
        );

        System.out.println("=======================");
        //第二种形式，lambda表达式
        list.stream().forEach(
                (String s) -> {
                    System.out.println(s);
                }
        );

        System.out.println("=======================");
        //第三种形式，lambda表达式简写
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("=======================");

//         long count()返回此流中的元素数量
        long n = list.stream().count();
        System.out.println("流中的元素数量为：" + n);
    }
}
