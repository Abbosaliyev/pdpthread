
import ReturnEnteredString.ReturnEnteredString;
import ReverseString.ReverceEnteredString;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Scanner scanner = new Scanner(System.in);
            menu();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    lock.lock();
                    executorService.execute(ReturnEnteredString::returnEnteredString);
                    lock.unlock();
                    break;

                case 2:
                    lock.lock();
                    executorService.execute(ReverceEnteredString::reverseString);

                    lock.unlock();
                    break;

                case 3:
                    lock.lock();
                    executorService.execute(ReturnEnteredString::returnEnteredString);
                    lock.unlock();

        }

    }

    private static void menu() {
        System.out.println("Choose one of the actions: ");
        System.out.println("1-return entered text");
        System.out.println("2-return reverse entered text");
        System.out.println("3-generate random string");
    }
}
