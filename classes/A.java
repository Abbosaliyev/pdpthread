package classes;

import java.util.concurrent.locks.ReentrantLock;

public class A implements Runnable {
    @Override
    public void run() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        System.out.println("A method ishladi ");
        lock.unlock();
    }
}
