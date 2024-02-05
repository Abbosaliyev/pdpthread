package classes;

import java.util.concurrent.locks.ReentrantLock;

public class C implements Runnable {
    @Override
    public void run() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        System.out.println("C method ishladi");
        lock.unlock();
    }
}
