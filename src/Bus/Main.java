package Bus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);


        int a = (int) ( Math.random() * 10 )+5;
        boolean whiles = false;







        /*Comparisons comparisons = new Comparisons(number);

        comparisons.comparisons();*/



        System.out.println("Number is " + a );
        System.out.println("Input number: ");

        while(true){

            int number = cin.nextInt();

            if (number == a){
                System.out.println("You win");
                break;
            }

            else if(number != a){
                System.out.println("Try again");


            }

        }







    }
}
