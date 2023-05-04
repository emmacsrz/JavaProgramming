package Day04_Concatenation;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(100+200); //prints as 300
        System.out.println(100-200); //prints as -100
        System.out.println("1" + "2"); //prints as 12 b/c these are 2 SEPARATE strings of text since we used " "  double quotes around the numbers
        System.out.println("--------------------------");
        System.out.println(10/2);
        System.out.println(20/6); //in java, you will always get an integer when dividing 2 integers.  Java will print this as 3 instead of 3.333~.
        //to get a mathematically correct answer:
        System.out.println(20.0/6); //you can convert a number to a decimal so it prints as a double (number with a decimal), by adding .0 to either the denominator or numerator.
        System.out.println(20/6d);//adding the "d" converts to double (Decimal number)
        System.out.println("--------------------------");

        System.out.println(10*2);
        System.out.println("--------------------------");
        //Module operator:
        System.out.println(10%3);

    }


}
