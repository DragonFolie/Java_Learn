package Generics;

public class BoxMain {
    public static void main(String[] args) {


        Box <Integer> box = new Box<>(20);
        Box <Integer> box2 = new Box<>(20);
        int result = box.getA() +box2.getA();
        System.out.println(result);

        int a = box.addArrayList(10,0);
        int b = box2.addArrayList(10,0);
        int c = a+ b;

        System.out.println( c);





        Box2 <String,Integer> box22 = new Box2<>("Name",15);
        Box2 <String,Integer> box23 = new Box2<>("Name",15);
        int results = box22.getValue() + box23.getValue();
        System.out.println("Result: " + results);



        OnlyNumberBox <Integer> onlyNumberBox1 = new OnlyNumberBox<>(50,50);
        int size = onlyNumberBox1.getA() * onlyNumberBox1.getB();
        System.out.println("Size: "+size);



    }
}
