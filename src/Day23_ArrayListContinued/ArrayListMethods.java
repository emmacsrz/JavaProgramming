package Day23_ArrayListContinued;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        //the following example is how to update an element in an array:
        int[] array = {1,2,3,4,5};
        array[0]=100;
        System.out.println(Arrays.toString(array));

//the following is an example of how to update an element in an arraylist.  You must call set() method in order to do this.  you will enter  2 arguments, the first is the index number of the element you want to update, the second is what you want to update it with.
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("eggs");
        groceryList.add("paper towels");
        groceryList.add("milk");
        groceryList.add("bread");
        System.out.println(groceryList);
        //using set method to update "milk" to "tacos"
        groceryList.set(2, "tacos");
        System.out.println(groceryList);



//removes method: ONLY REMMOVES 1 OBJECT, not multiple.
        groceryList.remove(0); //removes based on index number
        System.out.println(groceryList);


        groceryList.remove("paper towels"); //removes the object, not specific to index numbers
        System.out.println(groceryList);





    }
}
