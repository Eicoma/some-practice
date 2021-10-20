package eicoma.com.github.stream.practice;
/**
 * Stream流的中间操作方法之一
 * 过滤流的使用
 * <p>
 * Stream<T> filter(Predicate predicate)用于对流中的数据进行过滤
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //fileter(Predicate predicate) 过滤流对流中的数据进行过滤
        //第一种使用形式，通过匿名内部类作为参数传入filter()方法
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                boolean result = s.startsWith("张");
                return result;
            }
        }).forEach(s -> System.out.println(s));

        //第二种使用形式，通过lambda表达式实现
        list.stream().filter(
                (String s) -> {
                    boolean result = s.startsWith("张");
                    return result;
                }
        ).forEach(s -> System.out.println(s));

        //第三种使用形式，简化lambda表达式
        list.stream().filter(
                s -> s.startsWith("张")
        ).forEach(s -> System.out.println(s));
    }
}
