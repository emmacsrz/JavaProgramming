package Day22_WrapperClass_ArrayListIntro;

public class MinMaxOfMultiDimensionalArray {
    public static void main(String[] args) {



            /*

	2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
         */

        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};

        int max = array[0][0];
        int min = array[0][0];

        for(int[] each1d: array){ //finds each single dimensional array
            for (int eachElement : each1d) { //finds each element within the single dimensional arrays
                if (eachElement>max){
                    max = eachElement;  //this if statement compares each element, and only assigns the greatest one to the max variable
                }//max if statement end
                if (eachElement<min){
                    min = eachElement;  //same concept, checks each element and compares them to find smallest ones, only assigns the smallest ones to min variable.
                }//min if statement end
            }//inner loop end
        }//outer loop end.


        System.out.println("min: " + min);
        System.out.println("max : " + max);




    }
}
