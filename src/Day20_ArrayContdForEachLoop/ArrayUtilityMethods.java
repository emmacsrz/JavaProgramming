package Day20_ArrayContdForEachLoop;
import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
//toString method:
        int[] score = {70,100,80,90,65};
        //to print this, you need to call toString method, which needs an import statement first(above)
       String result = Arrays.toString(score);
        System.out.println(result);

//Equals() method:
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};
        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);

//sort() method:
        String[] s1={"a", "b", "c"};
        String[] s2= {"a", "c", "d"};
        System.out.println(Arrays.equals(s1,s2));

        int[] nums = { 100, 500, 90, 7, 20};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  //output will now be [7, 20, 90, 100, 500]
        //the sort method allows you to get the maximum and minmum number easily, however, you are usually NOT allowed to do this in an interview and will need to use a loop to show logic.


//copyOf() method:
        int[] array = {10,20,30,40,50,60,70};
        int[] array2 = Arrays.copyOf(array, 4); //copies from the beginning, to the specified length which is the 4th element in this case, the new array will contain [10,20,30,40]

        System.out.println(Arrays.toString(array2));


//copyOfRange() method:
        char[] ch ={'a', 'b', 'c', 'd', 'e', 'f', };
        char[] result1 =Arrays.copyOfRange(ch,4,6); //new array's will contain [e, f]
        System.out.println(Arrays.toString(result1));

    }
}
