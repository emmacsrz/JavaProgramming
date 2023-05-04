package Day14_MethodOverloadingLoopsintro;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number: ");
            sum += input.nextInt();
        } //will find the sum of 3 numbers


        System.out.println(sum);


        //write a program that can ask the user to enter a number for five times and then print the maximum number.



    }
}
