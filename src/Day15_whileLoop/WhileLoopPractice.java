package Day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //write a program that asks user to enter age, create if and else statement to determine if someone is eligible to buy alcohol or not.

        System.out.println("Enter your age:");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 150)) { //while age is invalid, this is repeated over and over again.
            System.out.println("invalid entry, please re-enteryour age:");
            age = input.nextInt();
        }

        if (age >= 21) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }


    }
}
