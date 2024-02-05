package entity;

public class A implements Runnable{
    @Override
    public void run() {
        Thread thread=new Thread(()->{
            System.out.println("A classman");
        });
        thread.start();

    }

}
