package day07_MultiBranchIf_NestedIf;

public class LoanApplication_Warmup {
    public static void main(String[] args) {
        //Salary: at least 45k, credit score: at least 700.
        int salary = 42_000,
                creditScore = 700;

        boolean eligible = creditScore>=700 && salary >=45_000;


        if (eligible){
            System.out.println("You are eligible for the loan");
        }else{
            System.out.println("You are not eligible");
        }



    }
}
