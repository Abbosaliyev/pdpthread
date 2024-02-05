package service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DService {
    Lock lock  = new ReentrantLock();
    public void run(){
        synchronized (lock){
            System.out.println("DService Started !");
        }
    }
}
