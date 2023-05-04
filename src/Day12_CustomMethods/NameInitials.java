package Day12_CustomMethods;
import java.util.Scanner;

public class NameInitials {
    public static void main(String[] args) {

        initials2("Emma", "Casarez");

        Scanner input = new Scanner(System.in);
        System.out.println("enter first name:");
        String firstname = input.next();
        System.out.println("enter last name:");
        String lastname = input.next();
        input.close();

        initials(firstname,lastname);

    }//main method end


    public static void initials(String firstname, String lastname) {
        char firstinitial = firstname.charAt(0);
        char lastiniital = lastname.charAt(0);
        String initials = firstinitial + "." + lastiniital + ".";
        System.out.println(initials.toUpperCase());
    }

    public static void initials2(String firstname, String lastname) {
        System.out.println(firstname.charAt(0) + "." + lastname.charAt(0)+ "."); //how to make this uppercase?

    }
}