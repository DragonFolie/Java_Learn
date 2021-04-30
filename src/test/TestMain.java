package test;

import Multithreading.Homework.RaceMain;

import java.util.*;

public class TestMain {
//    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//        list.add("Hola");
//        list.add("ass");
//        list.add("1313");
//
//
//
//    }

    public static class Testing {
        public static void main(String[] args) {
            HashMap<Integer, Double> map = new HashMap<Integer, Double>();
            ValueComparator idk = new ValueComparator(map);
            TreeMap<Integer, Double> sorted_map = new TreeMap<Integer, Double>(idk);


            map.put(13, 99.5);
            map.put(3, 67.4);
            map.put(4, 67.1);
            map.put(1, 67.3);

            System.out.println("unsorted map: " + map);
            sorted_map.putAll(map);
            System.out.println("results: " + sorted_map);
        }
    }

    static class ValueComparator implements Comparator<Integer> {
        Map<Integer, Double> base;

        public ValueComparator(Map<Integer, Double> base) {
            this.base = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with
        // equals.
        public int compare(Integer a, Integer b) {
            if (base.get(a) >= base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }
}
