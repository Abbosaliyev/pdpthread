import java.util.Scanner;

public class C extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Loading...");

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("C Thread");
    }
}
