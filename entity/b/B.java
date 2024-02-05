package entity.b;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class B implements Runnable{
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println("classes.B ishladi");
            Thread.sleep(1000);
            System.out.println("classes.B tugadi");
            System.out.println("\n");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
