package Bus;

public class Comparisons {

    private int num;
    int a = (int) ( Math.random() * 1 );
    boolean whiles = false;



    public Comparisons(int num) {
        this.num = num;
    }




    public void comparisons(){


        this.num = num;
        System.out.println("Number is " + a);

            if (num == a){
                System.out.println("You win");

            }

            else if(num != a){
                System.out.println("Try again");
                whiles = false;

            }







        }


    }

