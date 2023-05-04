package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 100;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
// boolean isZero = number == 0; you could write isZero like this, but we can also write like this;
        boolean isZero = !isPositive && !isNegative; //this expression means: // if the number is nOT positive AND NOT negative then it is 0.


        System.out.println("is positive?" + isPositive);
        System.out.println("is negative?" + isNegative);
        System.out.println("is zero? " + isZero);



/*

	2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.
			Ex:
				number = 200
			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */


    }


}
