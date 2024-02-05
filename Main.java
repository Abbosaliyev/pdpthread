import packAge.A;
import packAge.B;
import packAge.C;
import packAge.D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hi");
        while (true){
            A a = new A();
            B b = new B();
            C c = new C();
            D d = new D();
            Thread.sleep(1000);
            choose();
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1-> a.start();
                case 2-> b.start();
                case 3-> c.start();
                case 4-> d.start();
                case 0-> {return;}
            }
        }
    }

    private static void choose() {

        System.out.print("""
                =============================
                1. A
                2. B
                3. C
                4. D
                =============================
                (0) - exit
                Choose :""");
    }
}
