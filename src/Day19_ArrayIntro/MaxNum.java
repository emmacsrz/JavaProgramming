package Day19_ArrayIntro;

public class MaxNum {
    public static void main(String[] args) {

        int[] nums = {100,20,500,40,-10,30};

int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max= nums[i];
            }
        }
        System.out.println(max);



    }
}
