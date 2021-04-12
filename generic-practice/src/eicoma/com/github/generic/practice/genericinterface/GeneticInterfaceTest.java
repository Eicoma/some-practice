package eicoma.com.github.generic.practice.genericinterface;

/**
 * 泛型接口实现类的测试类
 */
public class GeneticInterfaceTest {
    public static void main(String[] args) {

        //创建泛型实现类的对象
        GenericImplement<String> g1 = new GenericImplement<>();
        g1.show("左宗棠鸡真好吃");

        GenericImplement<Integer> g2 = new GenericImplement<>();
        g2.show(666);

        //以具体类型创建泛型接口的实现类
        GenericImplement2 g3 = new GenericImplement2();
        g3.show(886);
    }
}
