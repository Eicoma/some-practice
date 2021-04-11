package eicoma.com.github.generic.practice.genericmethods;

public class GenericMethodsTest {
    public static void main(String[] args) {
//        GenericMethodsClass<String> genericMethodsName = new GenericMethodsClass<>();
//        genericMethodsName.show("左宗棠");
//
//        GenericMethodsClass<Integer> genericMethodsAge = new GenericMethodsClass<>();
//        genericMethodsAge.show(60);

        GenericMethodsClass g = new GenericMethodsClass();
        g.show("左宗棠和左宗棠鸡");
        g.show(60);
        g.show(false);
        g.show(12.5);
    }
}
