package day07_MultiBranchIf_NestedIf;

public class MultiBranchIf {
    public static void main(String[] args) {

//ex of independent if statements below:
        int num = 20;
        String result = " ";

        if (num > 0) { //if this is evaluated to true, is there still a point to check remaining conditions? NO.  You should use a multi-branch statement instead of this type of example.
            result = "positive";
        }
        if (num < 0) {
            result = "negative";
        }
        if (num == 0) {
            result = "zero";
        }          //every single condition of this entire  above statement is checked. This is a single if statement.
        System.out.println(result);
        System.out.println("------------------------------------------------------");
        //------------------------------------------------------
        //ex of multi branch statement:
        String result2 = " ";
        if (num > 0) {
            result2 = "positive";
        } else if (num < 0) {
            result2 = "negative";
        } else {
            result2 = "zero";
        }
        System.out.println(result2);


    }
}
