package Stream.hwWithDirector;

public class Main {
    public static void main(String[] args) {




        Director director = new Director();



        director.Gowork(new worker() {
            @Override
            public void work() {

                System.out.println("1");

            }

        });





        director.Gowork(() -> System.out.println("2"));



    }
}
