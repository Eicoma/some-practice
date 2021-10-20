package eicoma.com.github.generic.practice.genericmethods;

//现在仅仅是泛型类
//public class GenericMethodsClass<T> {
//    public void show(T t){
//        System.out.println(t);
//    }
//}

//进行泛型方法的定义
public class GenericMethodsClass {
    public <T> void show(T t) {
        System.out.println(t);
    }
}