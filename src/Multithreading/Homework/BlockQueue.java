package Multithreading.Homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockQueue {


    private final Queue<Runnable> queue = new LinkedList<>();
    private final Object monitor = new Object();

    public void add(Runnable task) {
        synchronized (monitor) {
            queue.add(task);
            monitor.notifyAll();
        }
    }

    public Runnable take() {
        synchronized (monitor) {
            try {
                while (queue.isEmpty()) {
                    monitor.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return queue.poll();
        }
    }



}

