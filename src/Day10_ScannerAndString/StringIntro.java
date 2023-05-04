package Day10_ScannerAndString;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "java";

        System.out.println();
        input.close();
        System.out.println("-----------------------------------------");

        String str1 = new String("Java"); // creates two objects, one is in string pool and one is in heap.  However when you call this variable,
        String str2 = new String("Java");



        String t1= "Python"; //saves in string pool
        String t2 = new String( "Python");  //saves outside the string pool
        String t3 = new String( "Python");  //also created outside the string pool, saves as a separate object.
        //if you compare them they are not evaluated to be the same object:
        System.out.println(t1 ==t2);




    }
}
