package day07_MultiBranchIf_NestedIf;

public class Gradereport {
    public static void main(String[] args) {
        int score = 50;
        char grade= ' ';


        if (score >=90 ) {
            grade = 'a';
        }else if (score >= 80 && score < 90){
            grade = 'b';
        } else if (score >= 70 && score <80){
            grade = 'c';
        }else if (score >=60 && score <70){
            grade ='d';
        } else{
            System.out.println("failed");
        }

        System.out.println(grade);









    }
}
