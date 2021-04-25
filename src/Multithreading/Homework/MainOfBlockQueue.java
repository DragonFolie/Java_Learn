package Multithreading.Homework;

import java.util.concurrent.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class MainOfBlockQueue {

    private static final String A= "A";
    private static final String B= "B";
    private static final String C= "C";
    private static String nextLetter = A;
    private static Object monitor = new Object();
    public static void main(String[] args) {



        ExecutorService task = Executors.newFixedThreadPool(3);

        BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor){
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (!nextLetter.equals(A)){
                                    monitor.wait();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.print(A);
                        nextLetter = B;
                        monitor.notifyAll();

                    }

                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor){
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (!nextLetter.equals(B)){


                                monitor.wait();

                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.print(B);




                        nextLetter = C;
                        monitor.notifyAll();

                    }

                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor){
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (!nextLetter.equals(C)){


                                monitor.wait();

                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.print(C);




                        nextLetter = A;
                        monitor.notifyAll();

                    }

                }

            }
        }).start();


















    }
}
