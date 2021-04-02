package CarPackage;

public class Car {
    private String brand;
    private int number;

    public Car(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;

    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car){
            Car car = (Car) obj;
            if(car.brand.equals(this.brand)&& car.number == this.number){
                return true;

            }
            else {
                return false;
            }
        }else {
            return false;
        }


    }

    /* @Override
        public boolean equals(Object obj) {

            if(obj instanceof Car){
                Car car = (Car) obj;
                System.out.println(car.brand+"s");

                return car.brand.equals(this.brand) && car.number == this.number;

            }else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            return brand.hashCode() + number;
        }
    */
    public void setNumber(int number) {
        this.number = number;
    }
}