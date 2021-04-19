package JUnit;

public class Vector {
    private double width;
    private double height;



    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double size(double width, double height){

        return height + width;
    }


    public static double Zeroto(double width    , double height){
        if(height == 0)
            throw new ArithmeticException("Cant");
        else if (width== 0)
            throw new ArithmeticException ("Cant");
        return height/width;
    }
    public static void Timecount() throws InterruptedException {
        Thread.sleep(500);
        return;

    }


}
