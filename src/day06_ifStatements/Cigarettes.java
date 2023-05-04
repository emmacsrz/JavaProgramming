package day06_ifStatements;

public class Cigarettes {
    public static void main(String[] args) {
//determine if someone is eligible to buy cigarettes. Age must be between 21-100.

        int age = 22;
        boolean legalAge = age >= 21 && age <100;
//you do not need above boolean variable, you can input the same data (age >= 21 && age <100) directly into below IF statement,  but it helps to have a boolean variable if you want to change the data requirements.


        if (legalAge) {
            System.out.println("can legally buy cigarette: " + legalAge);
        }

        //ineligible to buy cigarrets:
        boolean notLegalAge = age <21 || age > 100;
        if (notLegalAge){
            System.out.println("Age is inelligble to buy cigaretes: "+ notLegalAge);
        }

    }
}
