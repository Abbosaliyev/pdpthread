package ReturnEnteredString;

import java.util.Scanner;

public class ReturnEnteredString {
    public static void returnEnteredString() {
        System.out.println("Enter a text");
        String returnString = new Scanner(System.in).nextLine();
        System.out.println(returnString);
    }
}
