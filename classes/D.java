package classes;

import java.util.concurrent.locks.ReentrantLock;

public class D implements Runnable {
    @Override
    public void run() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        System.out.println("D method ishladi");
        lock.unlock();
    }
}
