package Day05_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        //Logical and: &&
        //suppose you are applying for a loan, first you must check 1) salary and 2) credit 3) age
        //personal info for loan:
        double salary = 60000;
        int creditScore = 650;
        int age = 25;
//creating a variable for credit requirements:
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
        System.out.println(eligibleForLoan); //prints true, both requirements are satisfied.
        System.out.println("--------------------------------");

//determine if this person is eligible to vote in usa. Conditions are: age at least 18, citizenship USA
        age = 16;
        String country = "usa";
        boolean eligibleToVote = age >= 18 && country == "USA" || country == "usa"; //added a || or operator
        System.out.println("Eligible to vote? - " + eligibleToVote);
        System.out.println("--------------------------------");

// || Logical OR operator

        String answer = "no";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);
        System.out.println("--------------------------------");

// || Logical OR operator

        char grade = 'b';
        boolean passedExam = grade == 'a' || grade == 'b' || grade == 'c';  //basically says : grade must be a, or b or c
        System.out.println(passedExam);

//---------------------------------
        String a = "yes";
        boolean yes = a == "yes";//true
        boolean no = !yes; //means opposite of "yes" -  gives false value
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);
//---------------------------------
        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed; //opposite of passed, so <=60

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);
//---------------------------------

        System.out.println(true == !false && false != true && true != !true);
        // all true, because it basically says : true = opposite of false, false does not equal true, true does not equal the opposite of true.

    }
}
