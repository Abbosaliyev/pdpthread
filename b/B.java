package b;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class B {
    private static final Lock lock=new ReentrantLock();


    public static void methodOfB(){
        try{
            lock.lock();
            Thread thread = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("b.B-Thread"+i);
                    //System.out.println("b.B thread ishladi");
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
