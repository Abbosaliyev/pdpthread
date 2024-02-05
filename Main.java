import utils.Input;
import entity.A;
import entity.B;
import entity.C;
import entity.D;



public class Main {

    public static void main(String[] args) {
        System.out.println("Thread programm!");
        while (true) {
            displayMenu();
            switch (Input.inputInt("Choose:")) {
                case 1 ->A.methodOfA();
                case 2->B.methodOfB();
                case 3->C.methodOfC();
                case 4-> D.methodOfD();
            }
        }


    }

    private static void displayMenu() {
        System.out.println("1-A method");
        System.out.println("2-B method");
        System.out.println("3-C method");
        System.out.println("4-D method");

    }

}
