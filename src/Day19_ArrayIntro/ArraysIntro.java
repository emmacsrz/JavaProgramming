package Day19_ArrayIntro;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //  int score1=85, 75, 9;   --> if you try to store multiple data like this, you will get a compiler error.
        //So you have to store like this:
        //int score1 =85; int score2= 75; ETC ETC.
        //There is an easier way to store multiples of data into a variable, by using a data structure variable such as an Array.

        int[] scores = new int[5];

        scores[0] = 85;
        scores[1]=90;
        scores[2] = 78;
        scores[3] = 81;
        scores[4] = 20;
        //the [] brackets make it an array variable.
        //if you want the array to contain 5 elements, you instantiate with 5.
        // System.out.println(scores);       //if you pass this array in a printmethod, it will return hashcode.  In order to print an array object, the to.string method is not  useful. you need to call the to string method from the UTILITY ClASS of arrays. CHeck notes

        System.out.println("--------------------");
        //below are examples of accessing data from an array:

        System.out.println(Arrays.toString(scores));

        System.out.println("--------------------");

        //using array with a loop:
        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
        }  System.out.println("--------------------");
//retrieving data from the last index number of array:
        System.out.println(scores[scores.length - 1]);


    }

}
