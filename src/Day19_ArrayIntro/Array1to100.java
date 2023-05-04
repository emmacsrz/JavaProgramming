package Day19_ArrayIntro;

import java.util.Arrays;

public class Array1to100 {
    public static void main(String[] args) {
//create an array that prints elements 1-100
        int[] arr1 = new int[100];
        //use a loop to acess each element of this array.

        for (int i = 0, j = 1; i < arr1.length; i++, j++) {  ///this is a for loop with 2 separate variables, the i is for finding the index numbers, the j is for the number you want to assign to them. IE, i =0, and j=1 because you want 1 (j) to be assgined to the index number of 0 (i)
            arr1[i] = j;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));


//another way to do this task is like so:
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=i+1;
        }
        System.out.println(Arrays.toString(arr1));


//array from 100 to 1

int[] arr2=new int[100];
        for (int i=0,  j=100 ; i <arr2.length; i++, j--) { //j is going down in value from 100 - 0, i is going from index 0-100 assigning the values of j. Therefore, the first index number will be assgined j's value which is 100, since J is decrementing DOWN, the net value will be 99, 98, etc, etc.

            arr2[i] = j;
        }

        System.out.println(Arrays.toString(arr2));

        //another way to do this task is:
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=100-1;
        }



    }
}
