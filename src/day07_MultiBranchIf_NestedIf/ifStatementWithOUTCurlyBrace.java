package day07_MultiBranchIf_NestedIf;

public class ifStatementWithOUTCurlyBrace {
    public static void main(String[] args) {
        //this is for if statement without curly braces {


        int age = 32;
//single if statement without curly braces:
        if (age >= 21) System.out.println("eligible");


//--------------------------------------------
        int day = 2;
        if (day == 1) System.out.println("monday");
        else if (day == 2) System.out.println("tuesday");
        else if (day == 3) System.out.println("wednesday");
        else if (day == 4) System.out.println("thursday");
        else if (day == 5) System.out.println("friday");
        else if (day == 6) System.out.println("saturday");
        else  System.out.println("sunday");

        //no curly braces indicates the if statement ONLY HAS one code fragment in its body.
    }
}
