package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A extends Thread {
    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("A class");
        } finally {
            lock.unlock();
        }
    }
}
