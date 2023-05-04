package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number % 2 == 0;
        if (isEven){
            System.out.println("even number");
        }

        if (!isEven) { // remember, ! implies OPPOSITE
            System.out.println("odd number");
        }


//example without boolean variable:

        if (number%2==0)
        {
            System.out.println("even number");
        }

    }
}
