package jaloladdin;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadThord implements Runnable{
    private final Lock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("-->> hi 3");
            lock.unlock();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
