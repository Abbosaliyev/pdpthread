package entity;

public class D extends Thread {
    @Override
    public void run() {
        synchronized (this) {

            System.out.println( "D Thread ->" + " Hello " );

        }
    }
}
