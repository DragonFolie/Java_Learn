package Multithreading;

import java.util.concurrent.*;

public class Timer {
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(3,new ThreadFactory() {
            @Override
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setDaemon(true);

                return thread;
            }
        });




//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                int second = 0;
//                try {
//                    while (true){
//                        System.out.println(second);
//                        Thread.sleep(1000);
//                        second++;
//
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.print(".");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Future<String> name = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1500);
                return "John";
            }
        });
        Future<Integer> age = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(1500);
                return 25;
            }
        });


        try {
            String nameOf = name.get();
            int ageOf = age.get();
            System.out.println("Name: " + nameOf);
            System.out.println("Age: " + ageOf);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }





        System.out.println("Finish");
    }
}
