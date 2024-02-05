package utils;

import java.util.Scanner;

public interface Input {
    static int inputInt(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + ": ");
        if ( scanner.hasNextInt() ) {
            return scanner.nextInt();
        } else return inputInt(msg);
    }
    static String inputStr(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + ": ");
        return scanner.nextLine();
    }
}
