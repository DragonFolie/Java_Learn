package test;

public class Monstr {
    private int height;
    private int width;

    private int eye;
    private int hand;
    private int foot;


    private int age =0;
    private int ass =0;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAss() {
        return ass;
    }

    public void setAss(int ass) {
        this.ass = ass;
    }

    public void showdata(){

        System.out.println("Age: " + age +"Ass: " + ass   );
    }


    public static int square (int i) {
        return i *i;
    }


    /*public Monstr(int eye, int hand, int foot) {
        this.eye = eye;
        this.hand = hand;
        this.foot = foot;
    }

    public void showMonstr(){
       System.out.println(eye+" - " + hand+" - " + foot);
   }

    public void Monstr1(Monstr Monstr){

       System.out.println(eye+" + " + hand+" + " + foot);




    }



    private void showvolume(){
        int result = width * height;
        System.out.println(result);



    }

    public void void1(int height,int width){
        this.height = height;
        this.width = width;
    }

    public void P(){
        int p = height + width;
        System.out.println(p);
    }

    public void S(){
        int s = height * width;
        System.out.println(s);
    }*/

}
