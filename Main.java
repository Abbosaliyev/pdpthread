import A.A;
import B.B;
import C.C;
import D.D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.println("Hi");

        while (true) {
            displayMenyu();
            System.out.print("Tanlang:");
            i = scanner.nextInt();
            switch (i) {
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
            ;

        }
    }

    private static void displayMenyu() {
        System.out.println("1-A.A" + "\n2-B.B" + "\n3-C.C" + "\n4-D.D");

    }
}
