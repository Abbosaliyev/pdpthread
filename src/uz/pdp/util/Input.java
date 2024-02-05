package uz.pdp.util;

import java.util.Scanner;

public interface Input {
    static int InputInt(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }else return InputInt(msg);
    }
    static  String InputStr(String msg){
        Scanner scanner= new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
}
