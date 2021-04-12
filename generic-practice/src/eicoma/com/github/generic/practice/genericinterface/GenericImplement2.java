package eicoma.com.github.generic.practice.genericinterface;

/**
 * 泛型接口的实现类定义（用具体的类型定义）
 */
public class GenericImplement2 implements GenericInterface<Integer>{
    @Override
    public void show(Integer integer) {
        System.out.println(integer);
    }
}
