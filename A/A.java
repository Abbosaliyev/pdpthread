package A;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A implements Runnable {

    @Override
    public void run() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try{
            System.out.println("A.A -> Salom ");
        }finally {
            lock.unlock();
        }
    }
}
