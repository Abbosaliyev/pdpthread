import entity.A;
import entity.B;
import entity.C;
import entity.D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter A , B , C or D : ");
            String str = scanner.nextLine();

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
}
