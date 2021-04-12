package eicoma.com.github.treeSet.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest3 {
    public static void main(String[] args) {
        Student2 stu1 = new Student2("zhangsan",75,75,75);
        Student2 stu2 = new Student2("lisi",85,85,85);
        Student2 stu3 = new Student2("wangwu",95,95,95);

        TreeSet<Student2> treeSet = new TreeSet<>();

        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);

        //采用迭代器打印集合
        Iterator<Student2> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
