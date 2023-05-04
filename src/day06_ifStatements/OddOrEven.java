package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number % 2 == 0; //says if remainder is 0 after being divided by 2, number is even number.
        boolean isOdd = !isEven; //opposite of above expression

        System.out.println(number + " is even? " + isEven);
        System.out.println(number + " is odd? " + isOdd);


    }

}
