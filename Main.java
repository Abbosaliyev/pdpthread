import threads.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter: ");
        String str = new Scanner(System.in).nextLine();
        switch (str) {
            case "A" -> {
                A a = new A();
                a.start();
            }
            case "B" -> {
                B b = new B();
                b.start();
            }
            case "C" -> {
                C c = new C();
                c.start();
            }
            case "D" -> {
                D d = new D();
                d.start();
            }
        }

    }
}
