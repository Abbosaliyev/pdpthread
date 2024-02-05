import threads.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                1) A thread
                2) B thread
                3) C thread
                4) D thread
                """);

        System.out.print("Choose: ");
        int index = new Scanner(System.in).nextInt();
        switch (index) {
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
