package uz.pdp;

import uz.pdp.papka.A;
import uz.pdp.papka.B;
import uz.pdp.papka.C;
import uz.pdp.papka.D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            display();
        switch (scanner.nextInt()) {
            case 1 -> {
                A a = new A();
                a.run();
            }
            case 2 -> {
                B b = new B();
                b.run();
            }
            case 3 -> {
                C c = new C();
                c.run();
            }
            case 4 -> {
                D d = new D();
                d.run();
            }
        }
        }




    }

    private static void display() {
        System.out.println("""
                1 -> A
                2 -> B
                3 -> C
                4 -> D
                """);
        System.out.print("Choose:");
    }
}
