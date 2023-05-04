package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //write a program for a simple calculator, ask for user to enter operator.   Use double. if they provide invalid operator, repeatedly ask user to re-enter.

        //update:  the program works,  but there are bugs.  could not find muhtar's code to compare.
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("enter first number:");
            double firstNum = input.nextDouble();

            System.out.println("enter operator: ");
            String operator = input.next();

            System.out.println("enter second number:");
            double secondNum = input.nextDouble();
            double result = 0;

            if (operator.equals("+")) {
                result += (firstNum + secondNum);
            } else if (operator.equals("-")) {
                result += (firstNum - secondNum);
            } else if (operator.equals("/")) {
                result += (firstNum / secondNum);
            } else if (operator.equals("*")) {
                result += (firstNum * secondNum);
            }

            System.out.println(result);

            System.out.println("Would you like to start again? yes/no?");

            String answer = input.next();
            answer = answer.toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("invalid entry. Would you like to enter another equation? ");
                answer = input.next();
            }
            if (answer.equals("no")) {
                break;
            }

        }


    }


}



