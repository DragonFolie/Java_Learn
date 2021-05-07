package Lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Test {
    public  static ArrayList<Car> createThreeCar (Supplier<Car> supplier){

        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            al.add(supplier.get());

        }
        return al;
    }

    public static void main(String[] args) {

        ArrayList<Car> ourCars = createThreeCar(()->new Car("Nissan","Silver",1.6));
        System.out.println("Cars " + ourCars);
    }
}

 class Car {
    String model;
    String color;
    double engine;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
}
