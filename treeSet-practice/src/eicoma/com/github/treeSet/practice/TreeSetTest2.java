package eicoma.com.github.treeSet.practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
TreeSet通过比较器进行排序
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        //在创建TreeSet对象时，在构造方法中传入Comparator接口的实现类对象并根据返回值来进行TreeSet的比较器排序
        //在这里，使用Comparator接口的匿名内部类对象作为参数
        // 也可以先创建该接口的实现类，重写其compare()方法后创建实现类的对象后再作为参数传入
        TreeSet<Teacher> treeSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });

        Teacher teacher1 = new Teacher("qiumin",21);
        Teacher teacher2 = new Teacher("huangjing",23);
        Teacher teacher3 = new Teacher("zuozhongzhi",25);
        Teacher teacher4 = new Teacher("wenhong",27);
        Teacher teacher5 = new Teacher("tanqun",25);

        treeSet.add(teacher1);
        treeSet.add(teacher2);
        treeSet.add(teacher3);
        treeSet.add(teacher4);
        treeSet.add(teacher5);

        Iterator<Teacher> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("-------------------------------------------");
        }
    }
}
