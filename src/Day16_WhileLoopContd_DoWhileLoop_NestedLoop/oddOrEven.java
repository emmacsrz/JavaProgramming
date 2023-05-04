package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " even number");
            } else {
                System.out.println(number + " odd number");
            }


            System.out.println("would you like to enter another number? Yes/no?");
            String answer = input.next();
            answer = answer.toLowerCase();


while(!(answer.equals("yes")||answer.equals("no"))) {  //this is the inner loop, this only gets executed if a user provides invalid response to the yes or no question.
    System.err.println("invalid entry. Would you like to enter another number? ");
    answer = input.next();
}
            if (answer.equals("no")) {
                break;
            }

        }







    }

}
