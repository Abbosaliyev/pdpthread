package entity;

public class C extends Thread {

    @Override
    public void run() {
        synchronized ( this ){

            System.out.println( "C Thread ->" + " Hello " );

        }
    }
}
