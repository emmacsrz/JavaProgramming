package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;

import java.util.Scanner;


public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String u, p;

        do {
            System.out.println("enter username:");
            u = input.next();
            System.out.println("enter password:");
            p = input.next();

        } while (!(u.equals("Cydeo") && p.equals("WoodenSpoon")));
        System.out.println("you are logged in! ");
    }
}
