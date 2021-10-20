package eicoma.com.github.hashset.practice;

/**
 * hashset底层为数据 + 链表 + 红黑树的结构
 * hashset初始容量为16，加载因子为0.75，2倍扩容
 * 即在hashset容量在达到16*0.75==12时扩容为2倍,即由16扩容至32
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        //通过重写Student类中的hashCode()和equals()方法后，重复的元素不会再添加到hashset中
        Student stu1 = new Student("zhangsan", 23);
        Student stu2 = new Student("lisi", 24);
        Student stu3 = new Student("wangwu", 24);
        Student stu4 = new Student("wangwu", 24);

        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu3);
        //此处属性值和stu3相同的stu4不会再添加进hashSet集合中
        hashSet.add(stu4);

        //迭代器打印集合元素
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
