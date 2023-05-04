package Day09_Scanner;
import java.util.Scanner;


public class NextLine_VS_Next {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("enter your age: " );
        int age = input.nextInt ();
        input.nextLine();
        System.out.println("you have entered: " +age );

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine ();
        System.out.println("full name= " + fullName);











    }




}
