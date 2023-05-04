package Day12_CustomMethods;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        maxNum(num1, num2);


        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
maxNum(num3, num4);

    }

    public static void maxNum(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is the greater number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greater number");
        } else {
            System.out.println("equal");
        }


    }

}
