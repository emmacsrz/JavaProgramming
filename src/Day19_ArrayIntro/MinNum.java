package Day19_ArrayIntro;

public class MinNum {
    public static void main(String[] args) {



        int [] nums = {100,200,30,-10,40};
int min = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <min){
                min = nums[i];

            }
        }
        System.out.println(min);
    }
}
