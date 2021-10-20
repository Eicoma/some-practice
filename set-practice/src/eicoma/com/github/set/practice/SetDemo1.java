package eicoma.com.github.set.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("www");
        set.add("www");
        set.add("github");
        set.add("com");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s);
        }

        System.out.println();
        System.out.println("---------------------------");

        for (String s : set) {
            System.out.print(s);
        }
    }
}
