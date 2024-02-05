import jaloladdin.ThreadFirst;
import jaloladdin.ThreadFourth;
import jaloladdin.ThreadSecond;
import jaloladdin.ThreadThord;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displey();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    new ThreadFirst().run();
                    break;

                case 2:
                    new ThreadSecond().run();
                    break;
                case 3:
                    new ThreadThord().run();
                    break;
                case 4:
                    new ThreadFourth().run();
                    break;
            }

        }
    }

    private static void firstThread() {
        Thread thread = new Thread(()->{
            System.out.println("first");
        });
    }

    private static void displey() {
        System.out.println("================================================================");
        System.out.println("1.First Thread");
        System.out.println("2.Second Thread");
        System.out.println("3.Thorth Thread");
        System.out.println("4.Fourth Thread");
        System.out.print("choose: ");
    }
}
