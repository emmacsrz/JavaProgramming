package day07_MultiBranchIf_NestedIf;

public class Grade2 {
    public static void main(String[] args) {
        char grade = 'b';
        String result = " ";

        if (grade == 'a') {
            result= "excellent";
        } else if (grade == 'b') {
            result= "very good";
        } else if (grade == 'c') {
            result= "good";
        } else if (grade == 'd') {
            result= "passed";
        } else {
            result= "fail";
        }
        System.out.println(result);

    }
}
