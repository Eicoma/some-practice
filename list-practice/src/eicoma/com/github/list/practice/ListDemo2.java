package eicoma.com.github.list.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("www");
        //list.add(".");
        list.add("github");
        //list.add(".");
        list.add("com");
        //list.add("/");
        list.add("eicoma");

        //删除指定索引的元素
        list.remove(0);
        System.out.println(list);

        //添加元素到指定索引
        list.add(0, "www");
        System.out.println(list);

        //更改指定索引的元素,并返回该元素
        System.out.println(list.set(list.size() - 1, "EICOMA"));
        System.out.println(list);

        //返回指定索引的元素
        System.out.println(list.get(list.size() - 1));

//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            String s = iterator.next();
//            System.out.print(s);
//        }

    }
}
