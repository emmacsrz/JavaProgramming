package day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {


        //DataType variableName = Data;
byte a = 100;
//here is how to use the variable:
        System.out.println(a);

        // this will print 100.   you do not need "" because that will print the a as a string of text instead of variable
        // byte a = 20.5 is a compiler error b.c byte cannot take decimal numbers
        //byte only accepts integer values (-128 to + 127)
        // anything within "" is considered a string of text
        long b = 9999999999999L;
        /*it is necessary to add the L after the number
        to force the compiler to take it as a Long value.  you can use uppercase or lower case L
         */
        System.out.println(b);
    }
}