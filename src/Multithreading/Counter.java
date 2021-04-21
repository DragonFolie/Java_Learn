package Multithreading;

public class Counter {
    private int value;
    private Object object = new Object();

    public void inc(){
        synchronized (object){
            value++;
        }


    }
    public void dec(){
        synchronized (object){
            value--;
        }

    }
    public int getValue() {
        return value;
    }
}
