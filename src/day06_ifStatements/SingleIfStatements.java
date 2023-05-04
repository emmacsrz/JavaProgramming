package day06_ifStatements;

public class SingleIfStatements {
    public static void main(String[] args) {

        int number = -100;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        if (isPositive) {
            System.out.println(number + " is positive");
        }
        //within the scope of the if block.  This code fragment can now only be executed under the set conditions.  if the number is not positive, the statement will not be executed.


        //is it a negative?:
        if (isNegative) {
            System.out.println(number + " is a negative number");
        }


        //is it zero??:
        if (isZero) {
            System.out.println(number + " is zero");

        }
        //=---------------------------------------
        //you can give a boolean condition directly inside of an if statement: example:
        int num = 0;
        if (num > 0) {
            System.out.println(num + " is zero");
        }

        if (num == 0) {
            System.out.println(num + " is zero");
        }

    }
}
