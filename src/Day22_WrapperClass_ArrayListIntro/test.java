package Day22_WrapperClass_ArrayListIntro;

import Utilities.ArraysUtility;

public class test {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60,70,90};

       boolean has25=  ArraysUtility.contains(numbers, 25);
        System.out.println(has25);




    }
}
