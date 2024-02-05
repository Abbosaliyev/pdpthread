import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
while (true){
        DisplayMenu();
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

    private static void DisplayMenu() {
        System.out.println("Choose");
        System.out.println("1.Class A");
        System.out.println("2.Class B");
        System.out.println("3.Class C");
        System.out.println("4.Class D");
        System.out.println("    ");
        System.out.println("    ");
    }
}
