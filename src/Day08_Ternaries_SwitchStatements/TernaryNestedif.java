package Day08_Ternaries_SwitchStatements;

public class TernaryNestedif {
    public static void main(String[] args) {
/*
Converting following expression into a nested if Ternary:
this is a nested if statement:
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
 */
//ternary version with nested if:

        int score = 61;
        String grade = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "failed"
                : "invalid ";
        System.out.println(grade);
        System.out.println("-------------------------");


        int n = 5;
        String day = (n >= 1 && n <= 7) ?
                (n == 1) ? "monday" : (n == 2) ? "tuesday" : (n == 3) ? "wednesday" : (n == 4) ? "thursday" : (n == 5) ? "friday" : (n == 6) ? "saturday" : "sunday"
                : "no such day";
        System.out.println(day);


    }
}
