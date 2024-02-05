package classes;

public class B implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("classes.B ishladi");
            Thread.sleep(1000);
            System.out.println("classes.B tugadi");
            System.out.println("\n");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
