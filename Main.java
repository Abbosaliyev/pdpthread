import entity.a.A;
import entity.b.B;
import entity.c.C;
import entity.d.D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            switch (scanner.nextInt()) {
                case 1:
                    A objA = new A();
                    objA.start();
                    break;
                case 2:
                    B objB = new B();
                    objB.run();
                    break;
                case 3:
                    C objC = new C();
                    objC.start();
                    break;
                case 4:
                    D objD = new D();
                    objD.start();
                    break;
                case 5:
                    return;

            }
        }

    }

    private static void menu() {
        System.out.println("1-> classes.A run");
        System.out.println("2-> classes.B run");
        System.out.println("3-> classes.C run");
        System.out.println("4-> classes.D run");
        System.out.println("5-> Exit");
    }
}
