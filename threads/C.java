package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C extends Thread {
    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println("C class");
        } finally {
            lock.unlock();
        }
    }
}
