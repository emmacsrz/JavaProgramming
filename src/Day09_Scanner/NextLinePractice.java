package Day09_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter full name: ");
        String name = input.nextLine(); // you do not have anything leftover in because nextline method reads ALL components includeing line breaks

        System.out.println("enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("enter your gender: ");
        String gender = input.next(); //using next for char variable m or f

        System.out.println("enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("enter your street: ");
        String street = input.nextLine();


    }
}
