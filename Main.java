import service.AService;
import service.BService;
import service.CService;
import service.DService;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        while (true){
            System.out.print("enter : ");
            String string = scannerStr.nextLine();
            switch (string){
                case "A" :
                    AService aService = new AService();
                    new Thread(()->{
                        aService.run();
                    }).start();
                    break;
                case "B" :
                    BService bService = new BService();
                    new Thread(()->{
                        bService.run();
                    }).start();
                    break;
                case "C" :
                    CService cService = new CService();
                    new Thread(()->{
                        cService.run();
                    }).start();
                    break;
                case "D" :
                    DService dService = new DService();
                    new Thread(()->{
                        dService.run();
                    }).start();
                    break;
            }
        }
    }
}
