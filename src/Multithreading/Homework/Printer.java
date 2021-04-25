package Multithreading.Homework;

public class Printer {

    private Object monitor = new Object();
    private Object monitor2 = new Object();
    public void print(){
        synchronized (monitor){





                System.out.println("Print  page");







            }



        }





    public void scan(){
        synchronized (monitor){




                System.out.println("Scanned page");


        }
    }


}
