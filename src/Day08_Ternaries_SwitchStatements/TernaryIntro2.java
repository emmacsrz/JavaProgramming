package Day08_Ternaries_SwitchStatements;

public class TernaryIntro2 {

    public static void main(String[] args) {
        //converting multi branch if statements to ternary:


//in this file we will convert the following statment to ternary:
        /*
                int number = 100;
                String result = " ";
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
        */
        int number = 100;
        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println(result);
        System.out.println("--------------------------");

        int n = 4;
        String day = (n ==1)?"Monday":(n==2)?"Tuesday":(n==3)?"Weds":(n==4)?"Thurs":(n==5)?"friday":(n==6)?"saturday":(n==7)?"sunday": "invalid day";
        System.out.println(day);


    }
}
