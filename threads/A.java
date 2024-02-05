package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A extends Thread {
    private final Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        System.out.println("threads.A class");
        lock.unlock();
    }
}
