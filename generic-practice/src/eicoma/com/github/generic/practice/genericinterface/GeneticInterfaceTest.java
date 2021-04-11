package eicoma.com.github.generic.practice.genericinterface;

/**
 * 泛型接口实现类的测试类
 */
public class GeneticInterfaceTest {
    public static void main(String[] args) {
        GenericImplement<String> g1 = new GenericImplement<>();
        g1.show("左宗棠鸡真好吃");

        GenericImplement<Integer> g2 = new GenericImplement<>();
        g2.show(666);
    }
}
