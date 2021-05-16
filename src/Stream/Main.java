package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Ivan");
        list.add("Drive");
        list.add("to");
        list.add("Masha");
        list.add("And...");

        List<Integer > list2 = list.stream().map(el -> el.length()).collect(Collectors.toList());


        System.out.println(list2);



        List<String > list3 = list = list.stream().filter(el -> el.length() > 4 ).collect(Collectors.toList());

        System.out.println(list3);

        list.stream().forEach(el -> System.out.println(el) );















//        new Thread(() -> System.out.println("1")).start();

    }
}
