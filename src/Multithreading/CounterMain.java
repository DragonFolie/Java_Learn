package Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterMain {
    public static void main(String[] args) {

        Counter counter = new Counter();
        CountDownLatch countDownLatch= new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);





        for (int i = 0; i < 10; i++) {


            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {


                        counter.inc();


                }countDownLatch.countDown();


                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int i = 0; i < 100; i++) {
                        counter.dec();


                }
                    countDownLatch2.countDown();
                }
            }).start();
        }





        try {
            countDownLatch.await();
            countDownLatch2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Result: " + counter.getValue());

//        Counter counter = new Counter();
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    counter.inc();
//                }
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                for (int i = 0; i < 100; i++) {
//                    counter.dec();
//                }
//            }
//        });
//        thread.start();
//        thread2.start();
//
//        System.out.println(counter.getValue());

    }
}
