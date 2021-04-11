package eicoma.com.github.generic.practice.genericlxtpf;

import java.util.ArrayList;
import java.util.List;

public class GenericLeiXingTongPeiFu {
    //类型通配符的定义
    List<?> list1 = new ArrayList<String>();
    List<?> list2 = new ArrayList<Object>();
    List<?> list3 = new ArrayList<Integer>();

    //类型通配符上限

    //会报错，因为Object类类型超过了Number这个上限
 //   List<? extends Number> list4 = new ArrayList<Object>();
    List<? extends Number> list5 = new ArrayList<Number>();
    List<? extends Number> list6 = new ArrayList<Integer>();

    //类型通配符下限
    List<? super Number> list7 = new ArrayList<Object>();
    List<? super Number> list8 = new ArrayList<Number>();
    //会报错，因为Number类为下限，而Integer类为Number的子类
    //List<? super Number> list9 = new ArrayList<Integer>();
}
