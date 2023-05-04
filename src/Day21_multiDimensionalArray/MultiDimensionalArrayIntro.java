package Day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90,100};
        //instead of storing these  above 3 arrays separately, we can put them into one container using multi dimensional array.
        System.out.println("-----------------");
        int[][] array2d = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90,100}};
//                index nos:       0                  1                2
        System.out.println(array2d.length); //will give you the length of the multi dimensional array,  if you have  3 arrays contained within the MDarray , this length will be 3, index numbers wolud be 0,1,2.
// how to access the first array in the 2darray:
        System.out.println(Arrays.toString(array2d[1]));// the [1]  is the index number of array2d, which is arr2 [40, 50, 60, 70, 80]


//how to access a specific element that is located within a 1D array within a 2D array.  IE, find 90 (which was originally  apart of arr3, and is now located within index no.2 in the 2D array)
        System.out.println(array2d[2][0]);  //the first [2] is specdifying the 2nd index number of array2d, the next part [0] is specifying the index nmber 0 of arr3




    }
}
