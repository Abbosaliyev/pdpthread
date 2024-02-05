import classes.A;
import classes.B;
import classes.C;
import classes.D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    A a = new A();
                    a.run();
                    break;
                case 2:
                    B b = new B();
                    b.run();
                    break;
                case 3:
                    C c = new C();
                    c.run();
                    break;
                case 4:
                    D d = new D();
                    d.run();
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. C");
        System.out.println("4. D");
    }
}
