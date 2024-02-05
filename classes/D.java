package classes;

public class D extends Thread {

    public void run() {
        try {
            System.out.println("classes.D boslandi");
            Thread.sleep(1000);
            System.out.println("classes.D tugadi");
            System.out.println("\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
