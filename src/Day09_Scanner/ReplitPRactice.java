package Day09_Scanner;
import java.util.Scanner;

public class ReplitPRactice {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = input.nextInt();

        System.out.println("Enter second number: ");
        int y = input.nextInt();

        System.out.println("Enter third number: ");
        int z = input.nextInt();

        if (y < x && x < z || z < x && x < y ) {
            System.out.println(x + " is the middle number");
        }else if (x < y && y < z || z < y && y < x){
            System.out.println(y + " is the middle number");
        }else{
            System.out.println(z + "is the middle number");
        }










        /*

    /*### Using `if statements` and `Scanner` write a program that will read three number inputs. Then using those number determine which number is the middle number. Follow the exact flow from the examples below.
```
Hint:
1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
```*/
    }
}
