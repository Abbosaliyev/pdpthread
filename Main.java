import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner (System.in);
        while (true) {
            Thread.sleep(1100);
            System.out.println("1 A");
            System.out.println("2 B");
            System.out.println("3 C");
            System.out.print("chooce: ");
            int i = scanner.nextInt();
            if (i == 1) {
                A a = new A();
                a.start();
            }
            if (i == 2) {
                B b = new B();
                b.start();
            }
            if (i == 3) {
                C c = new C();
                c.start();
            }
        }
    }
}
