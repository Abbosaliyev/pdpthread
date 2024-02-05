package uz.pdp.papka;

public class A implements Runnable {
    @Override
    public  void run() {
            synchronized (this){
                System.out.println("Hello word !");
                int i=20;
                int n=60;
                System.out.println("sum: "+(i+n));
            }
    }
}
