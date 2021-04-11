package eicoma.com.github.generic.practice.genericinterface;

/**
 * 泛型接口的实现类的定义
 * @param <T>
 */
public class GenericImplement<T> implements GenericInterface<T>{

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
