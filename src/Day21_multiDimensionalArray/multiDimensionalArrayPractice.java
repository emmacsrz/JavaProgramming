package Day21_multiDimensionalArray;

import java.util.Arrays;

public class multiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"james", "daniel"};
        String[] group2 = {"emma", "squidward"};
        String[] group3 = {"unicorn", "spongebob"};
        String[] group4 = {"chancho", "narwhal"};

        String[][] groups = {group1, group2, group3, group4};

        for (String[] eachGroup : groups) { //outer loop
            System.out.println(Arrays.toString(eachGroup));
            for (String eachName: eachGroup) {//inner loop
                System.out.println(eachName);
            }//inner loop end
        }//outer loop end

        System.out.println("-------------------in reverse order: ----------------------------------------");
//need help on this code:

        for (int i = groups.length - 1; i >= 0; i--) {

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }


        System.out.println("-----------------------------------------------------------");

        System.out.println(groups);

        System.out.println( Arrays.toString(groups)); // toString() ==> for single dimensional arrays ONLY

        System.out.println( Arrays.deepToString(groups) ); // deepToString() ==> for multi-dimensional dimensional arrays ONLY




    }
}
