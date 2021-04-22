package Multithreading.Homework;

public  class CashMashine {
    private String name;
    private int countOfmoneyInmashine ;
    private int takeOutmoney;
    private String result;

    private int amount;

    private final Object monitor = new Object();

    public CashMashine(int amount) {
        this.amount = amount;
    }

//    public void cashOut(String name, int takeOutmoney){
//
////        countOfmoneyInmashine =  1+ (int) ( Math.random() * 2000 );
////
////        System.out.println("Hi " + name + ", you take " + takeOutmoney +"$");
////        try {
////            Thread.sleep(1000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////        countOfmoneyInmashine = countOfmoneyInmashine-takeOutmoney;
////
////        if(takeOutmoney>countOfmoneyInmashine){
////            System.out.println("Sorry, not enought money in CashMashine");
////            result = "Sorry, not enought money in CashMashine";
////
////        }
////        else if (takeOutmoney<countOfmoneyInmashine)
////        {
////            System.out.println(name +" take "+takeOutmoney+", in mashine money left"+countOfmoneyInmashine);
////            result = name +" take "+takeOutmoney+", in mashine money left"+countOfmoneyInmashine;
////
////        }
////
//
//
//
//    }

    public synchronized void withdraw(String name,int amount){
        synchronized (monitor){
        System.out.println("Hi " + name + ", you take " + amount +"$");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        if(amount <= this.amount){
            this.amount -= amount;
            System.out.println(name +" take "+amount);
            System.out.println(name + " Left: " + this.amount);
        }
        else {

            System.out.println("Sorry, not enought money in CashMashine");

        }

    }}

    public String getResult() {
        return result;
    }
}
