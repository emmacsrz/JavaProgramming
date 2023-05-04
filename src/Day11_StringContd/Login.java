package Day11_StringContd;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String correctUserName = "cydeo",
                correctPassword = "woodenspoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter username:");
        String username = input.nextLine();
        System.out.println("Please enter password:");
        String password = input.nextLine();
        input.close();

            if (username.equals(correctUserName) && password.equals(correctPassword)) {
                System.out.println("you are now logged in");
            } else {
                System.out.println("Invalid credentials ");
    }


    }
}
