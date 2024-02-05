package uz.pdp.entity;

public class ClassRunnable extends Thread{


    @Override
    public void run() {
        System.out.println("This is run by Runnable");
    }
}
