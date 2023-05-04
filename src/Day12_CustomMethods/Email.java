package Day12_CustomMethods;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String email = input.nextLine();

        String firstName = email.substring(0, email.indexOf("_")); //finds first name, from index no 0 - _ character
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@")); //finds last name, by finding the index number of _ and adding 1, we get the first letter of the last name ... Then we ask for it to find the remaining letters until @ symbol. -you do not need to -subtract 1 for @ symbol because substring always excludes last index number.
        String domain =  email.substring(email.indexOf("@"), email.length()); //finds domain by finding @ symbol, and all characters remaining.

        String emailReverse= lastName + "_" + firstName + domain;


        System.out.println(email);
        System.out.println(emailReverse);







    }
}
