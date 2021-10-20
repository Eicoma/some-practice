package eicoma.com.github.list.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("www");
        list.add(".");
        list.add("github");
        list.add(".");
        list.add("com");
        list.add("/");
        list.add("eicoma");


        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s);
        }

    }
}
