package uz.pdp.papka;

public class B implements Runnable {
    @Override
    public void run() {
        Thread thread=new Thread(()->{
            synchronized (this){
                System.out.println("Hello word !");
                int i=20;
                int n=60;
                System.out.println("sum: "+(i+n));
            }
        });
        thread.start();
    }
}
