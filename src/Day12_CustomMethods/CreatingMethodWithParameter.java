package Day12_CustomMethods;

public class CreatingMethodWithParameter {
    public static void main(String[] args) {

        oddOrEven(3);
        eligibleToBuyAlcohol(20);
int age1 =21;
int age2 = 15 ;
eligibleToBuyAlcohol(age2);
eligibleToBuyAlcohol(age1);


    }


    public static void oddOrEven(int number) { //"int number" is the parameter
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    public static void eligibleToBuyAlcohol(int age) {

        if (age >= 21) {
            System.out.println(age + " is eligible to buy alcohol");
        } else if (age < 21 || age == 0) {
            System.out.println(age + " is not eligible to buy alcohol ");
        } else {
            System.out.println("invalid age");
        }
    }
}
