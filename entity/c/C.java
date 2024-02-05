package entity.c;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C extends Thread {
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println("classes.C ishladi");
            Thread.sleep(1000);
            System.out.println("classes.C tugadi");
            System.out.println("\n");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
