package Day13_CustomMethodsContd;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {
        System.out.println("please enter 2 numbers and an operator:");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        char mathOperator = input.next().charAt(0);
        calculate(num1, num2, mathOperator);

        System.out.println("-------------------------");
        System.out.println("please enter age:");
        int age = input.nextInt();

        ageGroup(age);

//---------------------------------------------------------------------------
        System.out.println("-------------------------");
        System.out.println("enter age:");
        int age2vote= input.nextInt();

        votingAge(age2vote);


    }
public static void votingAge(int age2vote){
        String eligible = (age2vote >=0 && age2vote <=150)?
                (age2vote >=18 )? "yes - can vote" : "no - cant vote"
        :"invalid age";

    System.out.println("eligible to vote? " + eligible);
}
    public static void ageGroup(int age) {

        String result = (age >= 0 && age <= 150)?
            (age < 21) ? "teenager" : (age >= 21 && age <= 55) ? "adult" : "senior"
        :"invalid age";

        System.out.println(result);


/*  here is same  statement written as  multi branch nested-if statement:

        if (age >= 0 && age <= 150) {
            if (age < 21) {
                System.out.println("teenager");
            } else if (age >= 21 && age <= 55) {
                System.out.println("21-55 - adult");
            } else if (age > 55) {
                System.out.println("senior");
            }
        } else {
            System.out.println("invalid age");
        }
*/

    }


    public static void calculate(double num1, double num2, char mathOperator) {

        switch (mathOperator) {
            case '+' :
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 + num2));
                break;
            case '-' :
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 - num2));
                break;
            case '*' :
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 * num2));
                break;

            case '/' :
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 / num2));
                break;
            default:


        }


    }

}

