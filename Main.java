import A.A;
import B.B;
import C.C;
import D.D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1 - A
                    2 - B
                    3 - C
                    4 - D
                    """);
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
}