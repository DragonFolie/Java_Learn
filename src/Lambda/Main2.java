package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {

       // Student student = new Student(20,30);
        List<String> ar = new ArrayList<>();
        ar.add("Ok");
        ar.add("Poka");
        ar.add("Yebisar");
        ar.add("Gerald");
        List<Integer> ar2 = new ArrayList<>();
        ar2.add(20);
        ar2.add(35);
        ar2.add(21);

                System.out.println(ar);

//        ar.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length()>6;
//            }
//        });

        ar.removeIf(ars -> ars.length()>=6); // Delete if ... == true





        //  P1.and(P2)  Коли умова P1  i P2 == true то -> .... в параметрі метода

        //  P1.or(P2)  Коли умова P1  або P2 == true то -> .... в параметрі метода




        System.out.println(ar);


        // -------------------------------------------------------------------------




    }
}
