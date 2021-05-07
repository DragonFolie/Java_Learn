package Lambda;

public class Student {

    private int a;
    private int b;

    @Override
    public String toString() {
        return "Student{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Student(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void info(){

        System.out.println("a- " + a +"b - "+b);
    }
}
