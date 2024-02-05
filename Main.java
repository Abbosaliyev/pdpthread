import entity.A;
import entity.B;
import entity.C;
import entity.D;

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
        System.out.println("1-entity.A" + "\n2-entity.B" + "\n3-entity.C" + "\n4-entity.D");

    }
}
