package Multithreading.Homework;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class RaceMain {
    public static void main(String[] args) {


        Semaphore tunelBarrier = new Semaphore(3);

        CountDownLatch countDownLatch = new CountDownLatch(10);
        TreeSet<Integer> resultOfTimeArray = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
             final int index = i;




            new Thread(new Runnable() {

                @Override
                public void run() {
                    long millis = (long)(Math.random() * 5000 + 1000);
                    System.out.println(index + " - Preparation started");

                    long before = System.currentTimeMillis();

                    try {
                        Thread.sleep(millis);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println(index+ " - Ready for race");

                        countDownLatch.countDown();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    System.out.println(index + " - started First road");

                    System.out.println(index + " - finished First road");

                    try {
                        tunelBarrier.acquire();
                        System.out.println(index + " - Started tunnel------------- ");


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            Thread.sleep(millis);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(index + " - Finished tunnel------------- ");
                        tunelBarrier.release();
                    }

                    System.out.println(index + " - Started Second road");
                    try {
                        Thread.sleep(millis);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(index + " - Finish Second road");

                    long after = System.currentTimeMillis();

                    int resultTime = (int) (after-before);

                    resultOfTimeArray.add(resultTime);





                }
            }).start();


        }

        System.out.println("Winner of race is index: "+ resultOfTimeArray.first() );

    }

    public void methods() {


    }
}
