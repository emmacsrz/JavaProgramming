package Day20_ArrayContdForEachLoop;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] reverse= new int[arr1.length];

        for (int i = arr1.length-1, j = 0; i>=0; i--, j++) {
            reverse[j]=arr1[i];
        }

        System.out.println(Arrays.toString(reverse));


        System.out.println("----------------------");



        /*
        	3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};

         */
    }
}
