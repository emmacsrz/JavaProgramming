package Day24_ArrayListContd_DateTimeIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {
    public static void main(String[] args) {

        System.out.println("-------------collections methods----------------");
        System.out.println();
        System.out.println("-------------replaceAll method----------------");

//replaceAll method "java" with "python"
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("java", "java", "java", "c#", "c#", "ruby", "swift"));
        System.out.println(students);

       /* for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals("java")){
                students.set(i, "python"); //replaces the java with python
            }
        }

        //the above loop method works, but you can easily use collections replaceAll method instead:
*/


        Collections.replaceAll(students, "java", "python"); //first you pass what arraylist you want to use, then 2 arguments, old value and new value.

        System.out.println(students);
        System.out.println("-------------Frequency method----------------");


//frequency method:
        int frequencyPython = Collections.frequency(students, "python");
        int frequencyCsharp = Collections.frequency(students, "c#");
        System.out.println("frequency of \"python\": " + frequencyPython);
        System.out.println("frequency of \"C#\": " + frequencyCsharp);

        System.out.println(students);
        System.out.println("-------------find unique element using frequency method:----------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,2,3,4,4,5,5,6,6));
        for (Integer each : numbers) {
            if (Collections.frequency(numbers,each) == 1){ //will only print numbers which have a frequency equal to 1, in this case it is 1 and 3 so output should match 1 and 3
                System.out.println(each);
            }
        }
        //finding frequency of characters (see other class, frequency of charcters)







    }
}
