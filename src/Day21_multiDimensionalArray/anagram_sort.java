package Day21_multiDimensionalArray;

import java.sql.Array;
import java.util.Arrays;

public class anagram_sort {
    public static void main(String[] args) {
String str1= "heart";
String str2="earth";

char[] array1 =  str1.toCharArray();
char[] array2 = str1.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        boolean isAnnagram = Arrays.equals(array1,array2);
        System.out.println(isAnnagram);









        /*
        2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false
         */
    }
}
