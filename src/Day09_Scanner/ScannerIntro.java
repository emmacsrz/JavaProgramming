package Day09_Scanner;
import java.util.Scanner; //wild import - imports just scanner so it used less memory

// import java.util. *;  --regular import, imports other packages as well and uses more memory.
public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        //if you want input, you call  in function (.in), if you want output function, you call out function (.out)
        // --- right now this scanner object is connected to keyboard.  You have to disconnect it by calling close method:

        System.out.println("enter your first number: ");
        byte num1 = input.nextByte ();

        System.out.println("enter your second number: ");
        short num2 =  input.nextShort ();

        System.out.println("enter your third number: ");
        int num3 = input.nextInt();

        System.out.println("enter your fourth number: ");
        long num4 = input.nextLong ();

        input.close(); //scanner is closed, can not read user inputs again.


        System.out.println("first number: "+num1);
        System.out.println("second number: " +num2);
        System.out.println("third number: " +num3);
        System.out.println("third number: " +num4);










    }
}
