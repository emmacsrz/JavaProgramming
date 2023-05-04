package Day21_multiDimensionalArray;

import java.util.Arrays;

public class iteratingMultiDimensionalArray {
    public static void main(String[] args) {
        System.out.println("using for loop:");
        //index of elements 0   1   2  /  0    1   2    3   4  / 0  1
        int[][] array2d = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};
        //index nums               0               1               2

        for (int i = 0; i < array2d.length; i++) {//i is index number of 1d arrays
            int[] each1d = array2d[i];
            System.out.println(Arrays.toString(each1d));  // this will print the single dimensional arrays,   you can use another loop to iterate the elements of each individual single dimensional array

            for (int j = 0; j < each1d.length; j++) {
                int eachElement = each1d[j];
                System.out.println(eachElement);//prints each element of each 1D array.

            }
        }
        System.out.println("-------------using for each loop: --------------");
//simpler method, same results.  For each loop is easier, regular for loop above is more powerful and has more specifics.

        for (int[] each1dArray :array2d) { //outer loop, will iterate each individual array
            System.out.println(Arrays.toString(each1dArray));
            for (int eachElement :each1dArray){//inner loop, will iterate over the indexes of the inner 1D arrays to return each element within them.
                System.out.println(eachElement);

            }
        }
        System.out.println("---------in reverse order: ------------------");
//in reverse order:
        for (int i = array2d.length - 1; i >= 0; i--) {
            for (int j = array2d[i].length - 1;  j>= 0; j--) {
                System.out.println(array2d[i][j]);
            }
        }






    }
}

