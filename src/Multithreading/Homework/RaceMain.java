package Multithreading.Homework;

import test.TestMain;

import java.util.*;
import java.util.concurrent.*;

public class RaceMain {
    public static void main(String[] args) {


        Semaphore tunelBarrier = new Semaphore(3);

        Semaphore ArrayListlBarrier = new Semaphore(1);

        CountDownLatch countDownLatch = new CountDownLatch(10);
        CountDownLatch countDownLatch2 = new CountDownLatch(10);

        ConcurrentHashMap<Integer,Double> resultOfTimeArray = new ConcurrentHashMap();

        ValueComparator idk = new ValueComparator(resultOfTimeArray);
        TreeMap<Integer, Double> sorted_map = new TreeMap<Integer, Double>(idk);








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

                    long resultTime =  (after-before);

                    System.out.println("Time" + resultTime);

                    try {
                        tunelBarrier.acquire();
                        System.out.println(index + " - Started add++++++++++++++");
                        resultOfTimeArray.put(index, (double) resultTime);


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            Thread.sleep(millis);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(index + " - Finished add+++++++++++++++ ");
                        tunelBarrier.release();
                    }







                    countDownLatch2.countDown();
                }
            }).start();


        }

//        Collections.sort(resultOfTimeArray);

        System.out.println("Wait");
        try {
            countDownLatch2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sorted_map.putAll(resultOfTimeArray);
        System.out.println("results: " + sorted_map);


//        System.out.println("Winner of race is index: " +sorted_map.getKey(0) +"Time"+ resultOfTimeArray.get(1) );

        for(Map.Entry<Integer, Double> entry: sorted_map.entrySet()) {


            // if give value is equal to value from entry
            // print the corresponding key

                System.out.println("Winner of race is index: " + entry.getKey() + " Time " +entry.getValue() );
                break;

        }
        for (int b = 0; b < resultOfTimeArray.size(); b++) {




            System.out.println("Result of race is index: "+ resultOfTimeArray.get(b) );
        }

    }

    static class ValueComparator implements Comparator<Integer> {
        Map<Integer, Double> base;

        public ValueComparator(Map<Integer, Double> base) {
            this.base = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with
        // equals.
        public int compare(Integer a, Integer b) {
            if (base.get(a) <= base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }

}
