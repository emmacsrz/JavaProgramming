package Day05_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 1000;
        int b = 200;
        //Verifying that a is > than b:
        System.out.println(a > b); // prints as true

        System.out.println("----------------------");

        boolean aIsGreater = a > b; //assigns a > b expression to boolean variable
        System.out.println(aIsGreater);

        System.out.println("----------------------");

//verify that a student has passed an exam:
        int testScore = 59;
        boolean passed = testScore >= 60;
        System.out.println(passed);
        System.out.println("----------------------");

        //determine if someone is old enough to buy alcohol:
        int DrinkingAge = 21;
        int age = 20;
        boolean OldEnough = age >= 21;
        System.out.println(OldEnough);
        System.out.println("----------------------");

        System.out.println(100 > 100);  //automatically turns it into a boolean t/f statement. HOWEVEr, this does not assign any data to a boolean variable.
        System.out.println(100<=85);//false
        System.out.println("----------------------");

        testScore = 48;
        boolean failed = testScore < 60;  //not less than or equal to b/c 60 is considered a pass. 59 and below is considred fail.
        System.out.println(failed);

        System.out.println("----------------------");

        System.out.println('a' > 'b'); //why no compiler error? b/c characters have corresponding numbers, check Ascii table for this
        //on ascii table, a = 65, b = 66. that means the final value will be false with the above statement.

        System.out.println("----------------------");

    }
}
