package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class D extends Thread {
    private final Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        System.out.println("threads.D class");
        lock.unlock();
    }
}
