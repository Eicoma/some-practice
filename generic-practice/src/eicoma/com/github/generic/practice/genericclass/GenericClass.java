package eicoma.com.github.generic.practice.genericclass;

public class GenericClass<T> {
    private T t;

    public GenericClass() {
    }

    public GenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "t=" + t +
                '}';
    }
}
