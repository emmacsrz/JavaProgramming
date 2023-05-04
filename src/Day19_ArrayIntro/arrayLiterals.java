package Day19_ArrayIntro;

import java.util.Arrays;

public class arrayLiterals {
    public static void main(String[] args) {
        int[] number = new int[5]; // this is assuming you do not know what the elements are for the array.
        //if you know exactlywhat the elements are, you can use an array literal:

        int[] nums= {1,2,3,4,5}; //- the size of this array is set to 5, becasue you have 5 elements.  The

//write a program to find thedays of the week

        String[] days ={"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
int n = 5;  //this is the actual day of the week, to convert it to an index number to find the corresponding day in the array, you will need to subtraact 1 from its value when printing: IE: to find teusday, you will assign 2 to the n variable, then subtract 1 from it b.c tuesday's index no is 1
        System.out.println(days[n-1]);


    }
}
