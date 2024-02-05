package entity;

public class B extends Thread {
    @Override
    public void run() {
        synchronized ( this ){

            System.out.println( "B Thread ->" + " Hello " );

        }
    }
}
