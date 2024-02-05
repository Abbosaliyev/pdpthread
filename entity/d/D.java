package entity.d;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class D extends Thread {
    Lock lock = new ReentrantLock();
    public void run() {
        lock.lock();
        try {
            System.out.println("classes.D boslandi");
            Thread.sleep(1000);
            System.out.println("classes.D tugadi");
            System.out.println("\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
