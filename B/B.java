package B;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class B implements Runnable {

    @Override
    public void run() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try{
            System.out.println("B.B -> Salom ");
        }finally {
            lock.unlock();
        }
    }
}
