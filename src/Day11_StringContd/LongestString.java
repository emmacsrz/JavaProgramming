package Day11_StringContd;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first string:");
        String first = input.nextLine();

        System.out.println("enter the second string:");
        String second = input.nextLine();
        input.close(); //disconnects connection between keyword (input) and scanner.
        //write a statement that determines which string is longest:

        if (first.length() > second.length()) {
            System.out.println("first string is the longest");
        } else if (first.length() < second.length()) {
            System.out.println("second string is longest");
        } else {
            System.out.println("equal");
        }


    }

}