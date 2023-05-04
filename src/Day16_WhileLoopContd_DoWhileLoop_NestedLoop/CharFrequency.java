package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "aaabbbccccccc";
        char ch = 'c';
        int charCount = 0;


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                charCount++;
            }
        }//if you want to fid the ammount of the other characters, you will need to repeat this approach.

        System.out.println(charCount);


    }
}
