package entity.a;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A extends Thread {
    Lock lock = new  ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println("classes.A boshlandi");
            Thread.sleep(1000);
            System.out.println("classes.A tugadi");
            System.out.println("\n");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
