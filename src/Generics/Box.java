package Generics;

import java.util.ArrayList;

public class Box<T> {
    private T a;
    private ArrayList<T> arrayList = new ArrayList<>();


    public Box(T a) {
        this.a = a;

    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
    public T addArrayList (T value,int b ){

        arrayList.add(value);
        return  arrayList.get(b);

    }


}
