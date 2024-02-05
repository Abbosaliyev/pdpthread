import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        while (true){
            System.out.println("Tanlang");
            displayMenu();
            int x = scanner.nextInt();
            switch (x){
                case 1:
                    a.start();
                    break;
                case 2:
                    b.start();
                    break;
                case 3:
                    c.start();
                    break;
                case 4:
                    d.start();
                    break;
            }
        }

    }

    private static void displayMenu() {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
    }

}
