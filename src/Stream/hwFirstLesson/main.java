package Stream.hwFirstLesson;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10));
        }


        List<Integer> filtered = filter(numbers, new Predicate() {
            @Override
            public boolean test(int a) {

                return a > 5;

            }
        });


        for (int i : filtered) {
            System.out.println(i);
        }


    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {


        List<Integer> result = new ArrayList<>();


        for (int i : list) {
            if (predicate.test(i)) {

                result.add(i);
            }
        }
        return result;
    }
}
