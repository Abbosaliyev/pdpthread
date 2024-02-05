package uz.pdp.entity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ClassReentered {
    public static void run() {
        Lock lock = new ReentrantLock();
        Thread thread = new Thread(()->{
            lock.lock();
            try{
                for (int i = 0; i < 10_000_000; i++) {
                    Test.a++;
                }

            }finally {
                System.out.println("with lock "+Test.a);
                lock.unlock();
            }
        });
        thread.start();


    }
}
