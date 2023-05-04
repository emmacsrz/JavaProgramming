package Day20_ArrayContdForEachLoop;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers= {10,20,30,40,50};

        for( int each :numbers) { //the  : separates the data structure and variable you use to get each element. left side of the column is a variable used for containing each iteration when the loop repeats. The type must match, if array is int, variable must be int too.
            System.out.println(each);
        }
            System.out.println("------------");
            //using for each loop to find odd numbers ony:
            int[]nums = {1,2,3,4,5,6};
            for (int each2 : nums) {
                if (each2%2 !=0){
                    System.out.println(each2);
                }
            }
        System.out.println("------------");


        System.out.println("-------------------------------------------");

        int[] nums1 = {100, 20, 30, 40, 5, 4, 3, 1, 2, 1000, 300, 500};

        int max = nums1[0];
        int min = nums1[0];

        for (int each : nums1) {

            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println("max = " + max);

        System.out.println("min = " + min);

        System.out.println("-------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100, 110, 120};

        int[] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++]= each;
        }

        for (int each : a2) {
            a3[k++]=each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("-------------------------------------------");

        String[] names = {"Mohammad Karimi", "Vasyl Dobrianski", "Gadir Ibrahimov", "Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0) +"."+each.charAt( each.lastIndexOf(" ") +1) );
        }




    }
}
