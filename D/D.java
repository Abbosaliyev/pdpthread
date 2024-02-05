package D;

public class D implements Runnable{
    @Override
    public void run() {
        Thread thread=new Thread(()->{
            System.out.println("D classman");
        });
        thread.start();

    }
}
