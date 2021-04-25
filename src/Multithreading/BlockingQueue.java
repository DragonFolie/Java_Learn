package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Runnable> queue = new LinkedList<>();

    public void add(Runnable task1){
        queue.add(task1);

    }
    public Runnable  take(){
        return queue.poll();

    }

}
