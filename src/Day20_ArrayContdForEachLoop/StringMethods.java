package Day20_ArrayContdForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
//tocharArray method:
        String str = "cydeo school";
        //if you want to get every character and store it into a data structure, such as array, use toCharArray:

        char[] ch= str.toCharArray(); //output: [c, y, d, e, o,  , s, c, h, o, o, l]
        System.out.println(Arrays.toString(ch));

//split method:
        String str2 = "today is a great day to learn java"; //use split method to get word by word

        String [] strArray= str2.split(" ");//you are splitting the string where the spaces are, creating an array
        System.out.println(Arrays.toString(strArray)); //output is [today, is, a, great, day, to, learn, java]

//push to git

    }
}
