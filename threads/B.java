package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class B extends Thread {
    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("threads.B class");
        } finally {
            lock.unlock();
        }
    }
}
