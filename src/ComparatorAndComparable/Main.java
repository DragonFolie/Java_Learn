package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Abb");
        list.add("Boka");
        list.add("Zebra");
        list.add("Koka");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<Employe> list1 = new ArrayList<>();
        Employe emp1 = new Employe(1,"Jora",889);
        Employe emp2 = new Employe(22,"Boris",256);
        Employe emp3 = new Employe(1,"Anna",156);

        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);

        System.out.println("\n\n" +list1 +"    \n\n");


        // ComparAble //// ComparAble //// ComparAble //// ComparAble //
        // ComparAble //// ComparAble //// ComparAble //// ComparAble //
        // ComparAble //// ComparAble //// ComparAble //// ComparAble //
        // ComparAble //// ComparAble //// ComparAble //// ComparAble //

//        System.out.println("Sorted: ");
//        Collections.sort(list1);
//        System.out.println(list1);


        // Comparator //// Comparator //// Comparator //// Comparator //
        // Comparator //// Comparator //// Comparator //// Comparator //
        // Comparator //// Comparator //// Comparator //// Comparator //
        // Comparator //// Comparator //// Comparator //// Comparator //


//        System.out.println("Sorted: ");
//        Collections.sort(list1,new IdComparator());
//        System.out.println(list1);


        //Name coprarator //

//        Collections.sort(list1,new NameComparator());
//        System.out.println(list1);


        // Comparator and ComparAble //// Comparator and ComparAble //
        // Comparator and ComparAble //// Comparator and ComparAble //
        // Comparator and ComparAble //// Comparator and ComparAble //
        // Comparator and ComparAble //// Comparator and ComparAble //

        // Воно полюбому буде по ід, але якщо треба по імені , то ми не
        // можемо залізти і поміняти
        // тому юзають такий мікс , і тоді воно буде тільки по імені сортувати
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1,new NameComparator());
        System.out.println(list1);



    }
}
