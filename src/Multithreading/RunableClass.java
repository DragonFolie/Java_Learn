package Multithreading;

public class RunableClass implements   Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i);

        }
    }
}
