package C;

public class C implements Runnable{
    @Override
    public void run() {
        Thread thread=new Thread(()->{
            System.out.println("C classman");
        });
        thread.start();


    }
}
