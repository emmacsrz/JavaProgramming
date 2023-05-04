import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuickPractice {

    public static void main(String[] args) {
int[] nums = {1,2,3,4,5,6,7};

int [] arr = new int[3];

arr[0]= nums[nums.length/2-1];
arr[1]=nums[nums.length/2];
arr[2]=nums[nums.length/2+1];

        System.out.println(Arrays.toString(arr));



    }
}

