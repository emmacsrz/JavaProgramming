package day06_ifStatements;

public class ifAndElsePractice {
    public static void main(String[] args) {
        int score = 50;
        boolean passed = score >=60;

        if (passed){
            System.out.println("Passed");
        }else { //if the FIRST codnition FAILS, then this "else" block gets executed automatically:
            System.out.println("Failed");
        }

    }
}
