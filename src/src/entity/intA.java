package entity;

public class intA {
    public static void isInteger(String a) {
        if(isInt(a)) {
                int number = Integer.parseInt(a);
                System.out.println("Integer value: " + number);
        }
    }

    public static boolean isInt(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
