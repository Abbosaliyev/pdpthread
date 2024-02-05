package D;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class D implements Runnable{

    @Override
    public void run() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try{
            System.out.println("D.D -> Salom ");
        }finally {
            lock.unlock();
        }
    }
}
