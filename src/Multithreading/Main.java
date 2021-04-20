package Multithreading;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start");
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    if(Thread.currentThread().isInterrupted()){
                        break;
                    }
                    System.out.print(i);

                }
            }
        } );
        thread.start();

//        System.out.println(Thread.currentThread());
        for (int i = 0; i < 1000; i++) {
            if (i==100){
                thread.interrupt();
            }

        }
        System.out.println("End");


    }
}
