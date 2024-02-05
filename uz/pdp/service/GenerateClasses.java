package uz.pdp.service;

import uz.pdp.entity.First;
import uz.pdp.entity.Fourth;
import uz.pdp.entity.Second;
import uz.pdp.entity.Third;
import uz.pdp.utils.Input;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GenerateClasses {
    public static void ok(){
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.shutdown();
        try {
            while (true){
                System.out.println("1 - class A\n2 - class B\n3 - class C\n4 - class D");
                switch (Input.INT("command: ")){
                    case 1:
                        First first = new First();
                        first.run();
                        break;
                    case 2:
                        Second second = new Second();
                        second.run();
                        break;
                    case 3:
                        Third third = new Third();
                        third.run();
                        break;
                    case 4:
                        Fourth fourth = new Fourth();
                        fourth.run();
                        break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
