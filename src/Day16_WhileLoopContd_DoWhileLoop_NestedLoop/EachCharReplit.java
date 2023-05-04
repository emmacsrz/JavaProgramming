package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;

import java.util.Scanner;

public class EachCharReplit {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));

    }
    public static String countLetters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) { //this loop is being used to count the characters one at a time. The inner loop checks against this (? check logic)
            int count = 0; // this counter wil reset every iteration of the for loop. This means every character will be counted from zero.

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }

            result += "" + count + str.charAt(i);

        }
        return result;
    }
}