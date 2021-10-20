package eicoma.com.github.atomicity.practice;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子性概念
 * <p>
 * 原子性是指在一次操作或者多次操作中，要么所有的操作全部都得到了执行
 * 并且不会受到任何因素的干扰而中断，要么所有的操作都不执行，
 * 多个操作是一个不可以分割的整体
 * <p>
 * AtomicInteger的构造方法
 * <p>
 * public AtomicInteger()：	   			    初始化一个默认值为0的原子型Integer
 * public AtomicInteger(int initialValue)：  初始化一个指定值的原子型Integer
 * <p>
 * 成员方法
 * <p>
 * int get():   			 				                  获取值
 * int getAndIncrement():      			 以原子方式将当前值加1，注意，这里返回的是自增前的值。
 * int incrementAndGet():     		     以原子方式将当前值加1，注意，这里返回的是自增后的值。
 * int addAndGet(int data):		    以原子方式将输入的数值与实例中的值（AtomicInteger里的value）相加，并返回结果。
 * int getAndSet(int value):   	        以原子方式设置为newValue的值，并返回旧值。
 */

public class AtomicIntegerDemo1 {
    public static void main(String[] args) {

        AtomicInteger ac1 = new AtomicInteger(5);
        System.out.println(ac1.get());
//        int getAndIncrement():
        AtomicInteger ac2 = new AtomicInteger(5);
        int i2 = ac2.getAndIncrement();
        //先获取再增加
        System.out.println(i2);
        System.out.println(ac2.get());

//        int incrementAndGet():
        AtomicInteger ac3 = new AtomicInteger(5);
        int i3 = ac3.incrementAndGet();
        //先增加再获取
        System.out.println(i3);
        System.out.println(ac3.get());

//        int addAndGet(int data):
        AtomicInteger ac4 = new AtomicInteger(5);
        int i4 = ac4.addAndGet(15);
        //先将两个值加起来，然后再获取值
        System.out.println(i4);
        System.out.println(ac4.get());

//        int getAndSet(int value):
        AtomicInteger ac5 = new AtomicInteger(5);
        int i5 = ac5.getAndSet(20);
        //先获取到值5，然后再设置新值
        System.out.println(i5);
        System.out.println(ac5.get());
    }

}
