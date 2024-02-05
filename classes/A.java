package classes;

public class A extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("classes.A boshlandi");
            Thread.sleep(1000);
            System.out.println("classes.A tugadi");
            System.out.println("\n");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
