package Day20_ArrayContdForEachLoop;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        //create a class to merge 2 arrays,
        /*

	2. write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
         */

        int []arr1 ={1,2,3,4};
        int []arr2 = {5,6,7};
        int []arr3 = new int[arr1.length + arr2.length];  //the 3rd array is set to the size it will need to contain the elemetns from the first 2 arrays. This needs to be exact, because the size is fixed.  If you have too many, the remianing will be 0

      int k =0; //used to track index of the 3rd array starting at 0;

        for (int i = 0; i<arr1.length; i++, k++){
            arr3[k] =arr1[i];
        } //after this loop, the value of k will be the next empty index number
        //IE: if you were to print right now, the elements of arr3 would be [1,2,3,4,0,0,0] and the value of K would be the first 0.

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }//this loop pcks up where last loop left off


        System.out.println(Arrays.toString(arr3));







    }
}
