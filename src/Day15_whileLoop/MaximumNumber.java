package Day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = -2147483648; //after first execution of loop, 10 becomes maximum number.  We assign smallest possible int number that way ANYTHING above this is a bigger int number.  If you had assigned 0, you would get a bug if there was a negative number


        for (int i = 0; i < 3; i++) { //loop condition (i<5)  must be true in order to run
            System.out.println("enter a number: ");
            int num = input.nextInt();
            if (num > max) {
                max = num;  //what happens here, is that if you enter a number, it reassigns it to the variable max IF it is bigger than the number previously entered.   Since we assigned the smallest int possiible, everything will be bigger. BUT, if you enter 5, and hten enter 1 next, the 1 will not be reassigned tothe max variable because it isnot bigger than the 5 that was previously reassigned.Essentially, the variable max is updated everytime this is executed.  in order to find the minmum number, you would use the largest possibel int number. 2147483647  -- see minimum number class.
            }
        }


        System.out.println("max number is = " + max);

    }
}

//write a program that can ask the user to enter a number for 5 times and return the maximum number
