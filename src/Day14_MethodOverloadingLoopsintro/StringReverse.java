package Day14_MethodOverloadingLoopsintro;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
//writing a program that will print characters in reverse:
        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println(reverseIt(str));
    }



    public static String reverseIt(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {  //finds the index numbers in reverse
            reverse += str.charAt(i); //finds characters associated with those index numbers in the order specified above. updates the "reverse" variable.
        }
        return reverse;

    }
}
