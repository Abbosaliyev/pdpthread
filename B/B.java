package B;

public class B implements Runnable{
    @Override
    public void run() {
        Thread thread=new Thread(()->{
            System.out.println("B classman");
        });
        thread.start();

    }
}
