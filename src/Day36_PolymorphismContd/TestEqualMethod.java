package Day36_PolymorphismContd;

import Day30_InhertianceContinue.phoneTask.iPhone;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false

        System.out.println(circle1.equals(circle2)); // true

        System.out.println(circle1.equals(circle3));  // false


        System.out.println("----------------------------------------------------------");

        iPhone iphone1 = new iPhone("Apple", "Iphone 12", "Black", 900);

        iPhone iphone2 = new iPhone("Apple", "Iphone 12", "Medium", 900);


        System.out.println(iphone1.equals(iphone2));


    }
}
