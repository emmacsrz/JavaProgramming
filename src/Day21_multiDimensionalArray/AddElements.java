package Day21_multiDimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};  //if you want to add the following element into this array, it is NOT possible b/c array size is fixed once created.  You will need to create a new array
        int element = 6;

        //creating a new array to innclude new element:

        int[] new_array = Arrays.copyOf(array, array.length+1); //old array length +1 so that you can add new element to the elements of the old one.  at this point if you print new_array the output will be [1,2,3,4,5,0] because the 5th index number is unassigned.
        //assigning 6 to the 5th index number:
        new_array[new_array.length-1]=element; //inside the [] brackets you are specifying which index number you want to update.  in this case, you want the length -1 BECAUSE length would give you 6th index  number, in this case we only go up to index number 5. Then you do = element to assign the new element to that index number.

        System.out.println(Arrays.toString(new_array));
        System.out.println("------------------------------------------");
        //using addelements custom method:
        int [] nums = {10,20,30,40};
        nums = ArraysUtility.addElement(nums, 50);
        System.out.println(Arrays.toString(nums));



    }
}
