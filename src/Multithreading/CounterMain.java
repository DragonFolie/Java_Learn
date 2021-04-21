package Multithreading;

public class CounterMain {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    counter.inc();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    counter.dec();
                }
            }
        });
        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getValue());

    }
}
