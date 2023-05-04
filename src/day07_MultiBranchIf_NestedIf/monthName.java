package day07_MultiBranchIf_NestedIf;

public class monthName {
    public static void main(String[] args) {
//multi branch if statement without curly braces:
        int n = 20;
        String month = "";

        if (n >= 1 && n <= 12) { //12 possible outcomes
            if (n == 1) month = "january";
            else if (n == 2) month = "february";
            else if (n == 3) month = "march";
            else if (n == 4) month = "april";
            else if (n == 5) month = "may";
            else if (n == 6) month = "june";
            else if (n == 7) month = "july";
            else if (n == 8) month = "august";
            else if (n == 9) month = "sept";
            else if (n == 10) month = "oct";
            else if (n == 11) month = "nov";
            else month = "dec";
        } else
            month = "no such month";

        System.out.println(month);


    }
}
