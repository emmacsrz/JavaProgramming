package Day09_Scanner;
import  java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to continue? Yes / no? " );
        String answer = input.next();   //this input can only reads  ONE word. if you enter multiple words in console , it will only return the first one
        System.out.println( "you have entered: " + answer);



        System.out.println("enter a character: ");
        char ch = input.next( ).charAt (0);
        System.out.println("you have entered: " + ch);



        System.out.println("enter a sentence: ");
        String answer2 = input.nextLine (); //this will read entire text  until NEXT LINE.  If you use this AFTER other lines of scanner you will get issues.
        System.out.println("you have entered: " + answer2);

        input.close();








    }
}
