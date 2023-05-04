package day06_ifStatements;

public class evenlyDivisible {
    public static void main(String[] args) {
        int number = 65;
        boolean isDivisibleBy5 = number%5==0; //
        boolean isDivisibleby2= number%2==0;
        boolean isDivisbleby3 = number%3==0;

        System.out.println("isDivisibleby2 = " + isDivisibleby2);
        System.out.println("isDivisibleBy5 = " + isDivisibleBy5);
        System.out.println("isDivisbleby3 = " + isDivisbleby3);


    }
}
