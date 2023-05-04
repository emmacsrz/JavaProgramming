package Day13_CustomMethodsContd;

import java.util.Scanner;
public class returnMethodsPractice {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.println("enter a number: ");
        int num = input.nextInt();
//using custom methods in an if statement:

        if(isEven(6)) {
            System.out.println( num +" is even");
        }else {
            System.out.println(num + " is even");
        }
        System.out.println(" - - - - - - -  - - - - - - - - - - - - - - ");
        System.out.println("enter 2 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(maxNum(num1, num2));
    }//main method end

public static boolean isOdd(int num){

    return (num%2 !=0)? true : false;
}//isOdd method end

public static boolean isEven(int num){
        return !isOdd(num);
}//isEven method end

    public static String maxNum (int num1, int num2){
        return (num1 > num2)? num1 + " is the max number": num2 +"  is the max number";


    }

}//class end
