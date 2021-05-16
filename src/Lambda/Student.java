package Lambda;

public class Student {

    private int a;
    private int b;

    @Override
    public String toString() {
        return "Student{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }





    public static void main(String[] args) {

        showname showname = new showname();

        showname.name(k -> {return k.length(); });



    }


}

class showname  {


    public void name(studentInterface s) {

        System.out.println( s.name("hi"));
    }


}


