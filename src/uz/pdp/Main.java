package uz.pdp;

import uz.pdp.entity.ClassRunnable;
import uz.pdp.entity.ClassThread;
import uz.pdp.util.Input;

public class Main {

    public static void main(String[] args) {
        switch (Input.InputInt("""
                1 - A (Thread).
                2 - B (Runnable).
                3 - C(ReentrantLock).
                4 - D(sync)""")) {
            case 1-> ClassThread.run();
            case 2-> ClassRunnable.currentThread().start();
        }


    }
}
