package uz.pdp;

import uz.pdp.utils.Input;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println("Sanjar Ismailov");
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        while (true){
            System.out.println("1 - class A\n2 - class B\n3 - class C\n4 - class D");
            switch (Input.INT("command: ")){
                case 1 ->{

                }
            }
        }
    }
}
