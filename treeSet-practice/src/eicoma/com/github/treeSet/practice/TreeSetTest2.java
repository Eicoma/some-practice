package eicoma.com.github.treeSet.practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
TreeSet通过比较器进行排序
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
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
