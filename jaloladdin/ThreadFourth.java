package jaloladdin;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadFourth implements Runnable{
    private final Lock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("-->> hi 4");
            lock.unlock();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
