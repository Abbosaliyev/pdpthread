import java.util.Scanner;

public class Main {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Hi");
        System.out.print("ismingizni kiriting: ");
        String str = scanner.nextLine();

        while (true){
            switch (displayMenu()) {
                case 1-> {
                    A a = new A();
                    a.run();
                }
                case 2-> {
                    B b = new B();
                    b.run();
                }
                case 3-> {
                    C c = new C();
                    c.run();
                }
                case 4-> {
                    D d = new D();
                    d.run();
                }

            }
        }


    }

    private static Integer displayMenu() {
        System.out.println("""
                1-A class
                2-B class
                3-C class
                4-D class
                """);
        return scanner.nextInt();
    }
}
