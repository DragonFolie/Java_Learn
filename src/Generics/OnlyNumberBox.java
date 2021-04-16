package Generics;

public class OnlyNumberBox<T extends Number> {
    private T a;
    private T b;

    public OnlyNumberBox(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

}
