package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("hello" + i); //starts from
        }


        System.out.println("-----------------------------------");

        for (int i = 1; i < 5; i++) {
            System.out.println("hello" + i);
        }

        System.out.println("-----------------------------------");
        int j = 0;
        while (j < 5) {
            System.out.println("hello" + j);
            j++;  //this will continuously increase the value of j, and eventually will make the above conditions j<5 untrue, which will terminate the loop.
        }
        System.out.println("-----------------------------------");

        int k = 0;
        do {
            System.out.println("hello" + k);
            k++;
        } while (k < 5);
        System.out.println("-----------------------------------");

        //write a program to find test score:
        System.out.println("enter your score:");

        int score = input.nextInt();

        while (score > 100 || score < 0) {//this means, if the user enters an invalid score, this while loop will run UNTIL they enter a valid score.
            System.out.println("invalid score, enter your score:");
             score = input.nextInt();
        }
if (score>=60){
    System.out.println("passed");
}else{
    System.out.println("failed");
}

    }
}
