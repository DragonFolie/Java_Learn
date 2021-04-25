package Multithreading;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
//    private int value;

    private AtomicInteger value = new AtomicInteger();

    Object object = new Object();

    //private Object object = new Object();

//    public void inc(){
//        synchronized (object){
//
//            value++;
//
//        }
//
//
//    }
//    public void dec(){
//        synchronized (object){
//
//            value--;
//
//        }
//
//    }
public void inc(){

    synchronized (object){
        value.getAndIncrement();
    }





}
    public void dec(){

    synchronized (object){
        value.getAndDecrement();
    }






    }
    public int getValue() {
        return value.intValue();
    }
}
