package C;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C implements Runnable{

    @Override
    public void run() {
        Lock lock = new ReentrantLock();
        lock.lock();
        try{
            System.out.println("C.C -> Salom ");
        }finally {
            lock.unlock();
        }
    }
}
