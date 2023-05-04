package Day11_StringContd;

import java.util.Scanner;


public class digitLetterSpecialChar {
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine(); //use this for using scanner one time. Also, if there is no characters in string, there are no index numbers.

        if (str.length() >= 1) { //asking if the string length is at least greater or equal to 1
            char f = str.charAt(0); //first character of string
            if (f >= '0' && f <= '9') { //this condition checks if the character is a digit (being between 0-9, characters 48-57 on ascii table).
                System.out.println("first character is a digit");
            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("first character is an uppercase letter");
            } else if (f >= 'a' && f <= 'b') {
                System.out.println("first character is a lowercase letter");
            }else{
                System.out.println("First character is a special character");}
        } else {//if string is empty
            System.out.println("String is empty");
        }


    }
}
