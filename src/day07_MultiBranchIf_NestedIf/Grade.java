package day07_MultiBranchIf_NestedIf;

public class Grade {
    public static void main(String[] args) {

        char grade = 'f';

        String result = " "; //string dependent on if statement below:

        if (grade == 'A') {
            result = "excellent";
        }

        if (grade == 'B') {
            result = "Great job";
        }

        if (grade == 'C') {
            result = "good";
        }

        if (grade == 'D') {
            result = "passed";
        }

        if (grade == 'F') {
            result = "failed";
        }



        System.out.println(result);


    }
}
