package Multithreading.Homework;

public class MainCashMashine {
    public   static void main(String[] args) {


        CashMashine cashMashine = new CashMashine(1000);
        long before = System.currentTimeMillis();

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
            cashMashine.withdraw("Olga",50);

            }
        });



        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cashMashine.withdraw("Ivan",750);

            }
        });
        Thread thread3 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cashMashine.withdraw("Ov",300);

            }
        });

        thread.start();
        thread2.start();
        thread3.start();

        try {
            thread.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long after = System.currentTimeMillis();
        System.out.println("Time: ");
        System.out.println( after-before);




    }
}
