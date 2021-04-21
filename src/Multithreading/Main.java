package Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {

                    if(Thread.currentThread().isInterrupted()){
                        break;
                    }
                    System.out.print(i);

                }
            }
        } );
        thread.start();

        Thread.sleep(10);
//        System.out.println(Thread.currentThread());
        for (int i = 0; i < 1000; i++) {
            if (i==100){
                thread.interrupt();
            }

        }
        System.out.println("End");


    }
}
