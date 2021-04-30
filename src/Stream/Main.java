package Stream;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

//        director.mustWork(new worker() {
//            @Override
//            public void work() {
//                System.out.println("Work");
//
//
//            }
//        });

        director.force(() -> System.out.println("Work"));







//        new Thread(() -> System.out.println("1")).start();

    }
}
