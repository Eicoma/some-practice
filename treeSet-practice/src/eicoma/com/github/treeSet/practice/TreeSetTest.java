package eicoma.com.github.treeSet.practice;

import java.util.Iterator;
import java.util.TreeSet;
/*
TreeSet的自然排序
 */

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("lisi",24);
        Student stu3 = new Student("wangwu",25);
        Student stu4 = new Student("zhaoliu",23);

        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);

        System.out.println(treeSet);

        System.out.println("-------------------------------------------------------------");

        Iterator<Student> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("**************");
        }
    }
}
