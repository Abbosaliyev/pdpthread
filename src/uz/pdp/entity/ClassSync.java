package uz.pdp.entity;

import java.util.concurrent.locks.ReentrantLock;

public class ClassSync {
    public static void run() {
        Thread thread = new Thread(()->{
            synchronized (new ReentrantLock()) {


                for (int i = 0; i < 10_000_000; i++) {
                    Test.a++;

                }
                System.out.println("with lock " + Test.a);
            }
        });
        thread.start();
    }
}
