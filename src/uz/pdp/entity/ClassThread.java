package uz.pdp.entity;

import uz.pdp.util.Input;

public class ClassThread {
    public static void run() {
        Thread thread = new Thread(()->{
            String name = Input.InputStr("Enter your name->");
            System.out.println("Wellcome "+name);
            System.out.println("This is run by Thread.");
        });
        thread.start();
    }
}
