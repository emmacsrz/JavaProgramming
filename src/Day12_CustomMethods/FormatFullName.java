package Day12_CustomMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = input.next().trim().replace(" ", "");
        String lastName = input.next().trim().replace(" ", ""); //trim/replace is getting rid ofany extra white spaces


        String FirstLetter_FirstName = firstName.substring(0, 1); // finds first letter of first name
        String Remaining_first = firstName.substring(1, firstName.length()); //finds the remaining letters of the last name
        String FirstLetter_lastName = lastName.substring(0, 1); // finds first letter of last name
        String Remaining_lastName = lastName.substring(1, lastName.length()); //finds the remaining letters of the last name

        String correctFormatFirstName = FirstLetter_FirstName.toUpperCase() + Remaining_first.toLowerCase(); //Puts the format together for the Uppercase first letter and lowercase remaining letters
        String correctFormatLastName = FirstLetter_lastName.toUpperCase() + Remaining_lastName.toLowerCase();

        System.out.println(correctFormatFirstName + " " + correctFormatLastName);


    }
}
