package Day21_multiDimensionalArray;
import java.sql.Array;
import java.util.Arrays;

public class WarmUpRemoveSpaces {
    public static void main(String[] args) {
        /*
        Warmup tasks:
	1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
         */
        String str = "  Hello world      I      love      Java    ";
        str=str.trim(); //trim extra spaces on beginning and end
        System.out.println(str);

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));//[Hello, world, , , , , , I, , , , , , love, , , , , , Java] will be the output of this, it is splitting it at every single space.

        str= ""; //sets string to an empty string so it can be garbage collected

        for (String each : words) {
            if (!each.isEmpty()){//is saying that if each is NOT EMPTY (!)
                str+=each+" ";
            }

        }
        System.out.println(str);



    }
}
