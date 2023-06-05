package Day38_ExceptionHandling;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
            if (age < 0) {
                throw new InputMismatchException("age of the person should not be negative: " + age); //manually throws an exception if the above requirements are not met, this is useful if you need to know which line the issue occurs at
            } else {
                throw new InputMismatchException("age of the person can not be greater than 150");
            }
        }

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        System.out.println("-----------------------------------------------------------");

        // throw new RuntimeException("Runtime exception");
        // System.out.println("Hello World");


        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------------------");

        RuntimeException exception = new RuntimeException();

        // throw exception;
        // throw new RuntimeException();

        // throw new Person("Jimmy", 45, 'M');


    }
}
