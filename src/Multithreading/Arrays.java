package Multithreading;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    private static List<String> list;

    public static void main(String[] args) throws InterruptedException {
        starttimer();
        Main2();

    }

    public static void  starttimer(){

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;

                try {
                    while (true){

                        System.out.println(i++);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });
        timer.setDaemon(true);
        timer.start();



    }
    public static void Main2() throws InterruptedException {

        List<Float> ar1 = new ArrayList<>();
        List<Float> ar2 = new ArrayList<>();
        for (float i = 0; i < 10000000; i++) {
            ar1.add(i);
        }

        long before = System.currentTimeMillis();

        for (int i = 0; i < ar1.size(); i++) {

            float beforeCalc = ar1.get(i);
            beforeCalc = (float) (before * Math.sin(0.5f +i/5) *Math.cos(0.5f +i/5)*Math.cos(0.4f +i/5));


            ar1.set(i,beforeCalc);
        }
        long after = System.currentTimeMillis();
        System.out.println("Result2: ");
        System.out.println( after-before);


        Thread thread1 = new Thread(new Runnable() {





            @Override
            public void run() {


                for (float i = 0; i < 10000000; i++) {
                    ar2.add(i);
                }

                long before = System.currentTimeMillis();

                for (int i = 0; i < ar2.size(); i++) {

                    float beforeCalc = ar2.get(i);
                   beforeCalc = (float) (before * Math.sin(0.5f +i/5) *Math.cos(0.5f +i/5)*Math.cos(0.4f +i/5));


                    ar2.set(i,beforeCalc);
                }
                long after = System.currentTimeMillis();

                System.out.println("Result");
                System.out.println( after-before);


            }
        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                for (float i = 0; i < 10000000; i++) {
//                    ar2.add(i);
//                }
//
//
//            }
//        });



        Thread.sleep(150);
        thread1.start();
//        thread2.start();

        thread1.join();

//        System.out.println(ar1.size());









    }
}
