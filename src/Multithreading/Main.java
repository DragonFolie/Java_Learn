package Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");
//        Thread thread = new Thread(new Runnable()
//        {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000; i++) {
//
//                    if(Thread.currentThread().isInterrupted()){
//                        break;
//                    }
//                    System.out.print(i);
//
//                }
//            }
//        } );
//        thread.start();
//
//        Thread.sleep(10);
////        System.out.println(Thread.currentThread());
//        for (int i = 0; i < 1000; i++) {
//            if (i==100){
//                thread.interrupt();
//            }
//
//        }

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        CountDownLatch countDownLatch = new CountDownLatch(2);
//
//
//
//        Runnable task1 =new Runnable() {
//            private int sum = 0;
//            @Override
//            public void run() {
//
//                for (int i = 0; i < 1000000; i++) {
//                    if (i%2 == 0){
//                        sum +=i;
//
//                    }
//
//                }
//
//                System.out.println("Sum1 is: "+sum);
//                countDownLatch.countDown();
//
//
//            }
//        };
//        Runnable task2 = new Runnable() {
//            @Override
//            public void run() {
//                long sum = 0;
//                for (int i = 0; i < 1000000; i++) {
//                    if (i % 7 == 0) {
//                        sum += i;
//                    }
//                }
//                System.out.println("Task2: " + sum);
//                countDownLatch.countDown();
//            }
//        };
//
//        executorService.execute(task1);
//        executorService.execute(task2);
//        executorService.shutdown();
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        System.out.println("End");


        CountDownLatch countDownLatch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            private long sum = 0;
            @Override
            public void run() {

                for (int i = 0; i < 1000000; i++) {
                    if (i%2 == 0){
                        sum +=i;

                    }

                }

                System.out.println("Sum1 is: "+sum);
                countDownLatch.countDown();


            }
        });
        Thread thread2 = new Thread(new Runnable() {
            private long sum = 0;
            @Override
            public void run() {

                for (int i = 0; i < 1000000; i++) {
                    if (i%7 == 0){
                        sum +=i;

                    }

                }

                System.out.println("Sum2 is: "+sum);
                countDownLatch.countDown();


            }
        });


        executorService.execute(thread1);
        executorService.execute(thread2);

        executorService.shutdown();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long after = System.currentTimeMillis();
        System.out.println("Time"+(after-before));


    }
}
