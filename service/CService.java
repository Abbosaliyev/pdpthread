package service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CService {
    Lock lock  = new ReentrantLock();
    public void run(){
        synchronized (lock){
            System.out.println("CService Started !");
        }
    }
}
