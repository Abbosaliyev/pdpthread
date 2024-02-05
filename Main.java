import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        ExecutorService service = Executors.newFixedThreadPool(3);

        System.out.print("Enter something: ");
        String a = new Scanner(System.in).nextLine();

        service.execute(()-> {
            lock.lock();
            intA.isInteger(a);
            lock.unlock();
        });
        service.execute(()-> {
            lock.lock();
            stringA.isString(a);
            lock.unlock();
        });
        service.execute(()-> {
            lock.lock();
            charA.isChar(a);
            lock.unlock();
        });
        service.shutdown();
    }
}
