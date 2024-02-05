package c;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C {
    private static final Lock lock=new ReentrantLock();


    public static void methodOfC(){
        try{
            lock.lock();
            Thread thread = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("c.C-Thread"+i);
                   // System.out.println("c.C thread ishladi");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            thread.start();

        }finally {
            lock.unlock();
        }
    }
}
