package classes;

import java.util.concurrent.locks.ReentrantLock;

public class B implements Runnable {
    @Override
    public void run() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        System.out.println("B method ishladi");
        lock.unlock();
    }
}
