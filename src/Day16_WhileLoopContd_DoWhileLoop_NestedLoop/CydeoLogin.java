package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;
import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);


        System.out.println("enter username:");
        String username = input.next();
        System.out.println("enter password:");
        String password = input.next();
int attempts =0;
        while(!(username.equals("Cydeo") || password.equals("WoodenSpoon"))) {
            System.err.println("invalid credentials ");
            System.out.println("re - enter username:");
            username = input.next();
            System.out.println("re - enter password:");
            password = input.next();
            attempts++;
            if (attempts == 3) {
                System.out.println("account is locked");
                break;
            }
        }

if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
    System.out.println("You are logged in!");
}









    }
}
