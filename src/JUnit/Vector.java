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

    public double size(){
        return Math.sqrt(height*height + width*width);
    }
    public static double Zero(){
        if(height == 0)
            throw ArithmeticException("Cant");
        if (width== 0)
            throw ArithmeticException.class;
        return height/width;
    }
}
