package eicoma.com.github.generic.practice.genericclass;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericClassTest {
    public static void main(String[] args) {
        //创建泛型类的对象
        GenericClass<String> genericName = new GenericClass<>();
        genericName.setT("左宗棠");

        GenericClass<Integer> genericAge = new GenericClass<>();
        genericAge.setT(60);

        GenericClass<Boolean> genericIsLive = new GenericClass<>();
        genericIsLive.setT(false);

        ArrayList arrayList = new ArrayList();
        arrayList.add(genericName);
        arrayList.add(genericAge);
        arrayList.add(genericIsLive);

        //使用迭代器遍历集合中的元素并输出
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
