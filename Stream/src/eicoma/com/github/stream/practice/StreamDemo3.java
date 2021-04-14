package eicoma.com.github.stream.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream<T> limit(long maxSize)返回此流中的元素组成的流，截取前指定参数个数的数据
 * Stream<T> skip(long n)跳过指定参数个数的数据，返回由该流的剩余元素组成的流
 * static <T> Stream<T> concat(Stream a, Stream b)合并a和b两个流为一个流
 * Stream<T> distinct()返回由该流的不同元素（根据Object.equals(Object) ）组成的流
 */

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
//        Stream<T> limit(long maxSize)返回此流中的元素组成的流，截取前指定参数个数的数据
        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("============================");

//        Stream<T> skip(long n)跳过指定参数个数的数据，返回由该流的剩余元素组成的流
        list.stream().skip(2).forEach(s -> System.out.println(s));

        System.out.println("============================");
//        static <T> Stream<T> concat(Stream a, Stream b)合并a和b两个流为一个流
        List<String> list2 = new ArrayList<>();

        list2.add("林青霞");
        list2.add("张曼玉");
        list2.add("王祖贤");
        list2.add("柳岩");
        list2.add("张敏");
        list2.add("张无忌");

        Stream stream1 = list.stream();
        Stream stream2 = list2.stream();
        Stream.concat(stream1,stream2).forEach(s -> System.out.println(s));

        //简化格式
        System.out.println("------------------------------------------");
        Stream.concat(list.stream(),list2.stream()).forEach(s -> System.out.println(s));

        System.out.println("============================");
//        Stream<T> distinct()返回由该流的不同元素（根据Object.equals(Object) ）组成的流
        List<String> list3 = new ArrayList<>();

        list3.add("林青霞");
        list3.add("张曼玉");
        list3.add("王祖贤");
        list3.add("柳岩");
        list3.add("张敏");
        list3.add("张无忌");
        list3.add("张无忌");
        list3.add("张无忌");
        list3.add("张无忌");

        list3.stream().distinct().forEach(s -> System.out.println(s));
    }
}
