package eicoma.com.github.treeSet.practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 需求：请自行选择比较器排序和自然排序两种方式
 * 要求：存入四个字符串，“c”,"ab","df","qwer"
 * 按照长度排序，如果一样长则按照首字母排序
 */

//这里如果采用自然排序，会无法实现按长度排序的需求
//因此采用比较器排序的方式对TreeSet进行排序
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
            }
        });

        treeSet.add("c");
        treeSet.add("ab");
        treeSet.add("df");
        treeSet.add("qwer");

        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
