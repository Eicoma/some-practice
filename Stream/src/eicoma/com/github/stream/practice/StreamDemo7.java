package eicoma.com.github.stream.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 案例需求
 *
 * 现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
 *
 * - 男演员只要名字为3个字的前三人
 * - 女演员只要姓林的，并且不要第一个
 * - 把过滤后的男演员姓名和女演员姓名合并到一起
 * - 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
 *
 * 演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
 */

public class StreamDemo7 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("周润发");
        list1.add("成龙");
        list1.add("刘德华");
        list1.add("吴京");
        list1.add("周星驰");
        list1.add("李连杰");

        list2.add("林心如");
        list2.add("张曼玉");
        list2.add("林青霞");
        list2.add("柳岩");
        list2.add("林志玲");
        list2.add("王祖贤");

        Stream<String> manStream = list1.stream().filter(
                (String s) -> {
                    return s.length() == 3;
                }
        ).limit(3);

        Stream<String> womanStream = list2.stream().filter(
                (String s) -> {
                    return s.startsWith("林");
                }
        ).skip(1);

        //将两个流合并到一个流stream中
        Stream<String> stream = Stream.concat(manStream,womanStream);
        //用lambda表达式去遍历stream流中的所有元素并使用
        stream.forEach(
                (String name) -> {
                    Actor actor = new Actor(name);
                    System.out.println(actor);
                });
    }

}
