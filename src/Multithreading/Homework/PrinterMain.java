package Multithreading.Homework;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class PrinterMain {
    private static int  enter =3;
    public static void main(String[] args) {



        Printer printer = new Printer();


        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < 10; i++) {


            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 1; i < enter+1; i++) {

                        System.out.println(i);
                        printer.scan();
                        print();


                    }

                }
            });

            executorService.shutdown();

        }

    }

    public static void print() {
        Printer printer = new Printer();


            printer.print();




    }
}
