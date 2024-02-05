public class D implements Runnable{

    @Override
    public void run() {
        Thread thread = new Thread(() -> {
            System.out.println("A -> Salom ");
        });
        thread.start();
    }
}
