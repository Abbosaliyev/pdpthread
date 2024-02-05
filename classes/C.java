package classes;

public class C extends Thread {
    @Override
    public void run() {

        try {
            System.out.println("classes.C ishladi");
            Thread.sleep(1000);
            System.out.println("classes.C tugadi");
            System.out.println("\n");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
