package day07_MultiBranchIf_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 2002;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
        } else {
            System.out.println("invalid score");
        }


        System.out.println("------------------------------");

        int age = 18;
        if (age >= 1 && age < 150) {
            if (age >= 21) {
                System.out.println("eligible");
            }
        } else {
            System.out.println("not eligible");
        }

        System.out.println("--------------------------------");

//This Statement is not the best practice:

 /*       if (day == 1) {
            System.out.println("monday");
        } else if (day == 2) {
            System.out.println("tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("invalid number");
        }/*

  */
        //in the above example, java executes from top to bottom, so it WILL give you the right answer, but there are more efficient ways of achieving this.

        int day = 3;

        if (day >= 1 && day <= 7) { //pre condition
            if (day == 1) {
                System.out.println("monday");
            } else if (day == 2) {
                System.out.println("tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else { //this block means if pre condition has failed
            System.out.println("invalid day");
        }


    }
}
