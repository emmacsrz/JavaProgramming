package Day08_Ternaries_SwitchStatements;

public class ifStatementandTernaryPractice {
    public static void main(String[] args) {
//mixing if  statments and ternaries:

        //the following  is an example of nested if with ternaries:
//inner if statments in this expression use ternary.  If you completed this ENTIRE nested if statement with JUST ternaries, it would not be readable and undersatndable.

        int score = 72;
        String result = " ";
        if(score >= 0 && score <=100) {
            result = (score >= 90)? "a ": (score >=80)? "b": (score >= 70)? "c": (score >=60)? "d": "failed";
        }else {
            result = "invalid score";
        }
        System.out.println(result);


        System.out.println("--------------------------------");
//the following achieves the SAME EXACT results but uses ONLY ternaries for the statement.  This makes it much less readable and arguably, more confusing.

        String result2 = (score >= 0 && score <=100)?
                result2 = (score >= 90)? "a ": (score >=80)? "b": (score >= 70)? "c": (score >=60)? "d": "failed"
                :"invalid score";

        System.out.println(result2);



    }
}
