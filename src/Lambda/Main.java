package Lambda;

public class Main {
    static void def(I i){
        System.out.println(i.abc("Hi"));

    }

    public static void main(String[] args) {



//        def(  (String str) -> {return str.length();});

        I i = (String a) -> { return "20";};

        def(i);
        // (String str) -> {return str.length();}
//        def(new I() {
//            @Override
//            public int abc(String s) {
//                return 0;
//            }
//
//        });






    }



}

class Over{
    static public void oes(String s){
        System.out.println(s);
    }

}
interface  I{
    String abc ( String s);
}

