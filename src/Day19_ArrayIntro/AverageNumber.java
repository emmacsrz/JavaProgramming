package Day19_ArrayIntro;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("how many nums do you want to enteR?");
        int total = input.nextInt();

        int[] numbers= new int[total];
int sum = 0;
        for (int i = 0; i < total; i++) {
            System.out.println("enter a number:");
            numbers[i] =input.nextInt();
            sum+=numbers[i];

        }
        DecimalFormat df = new DecimalFormat("0.00");

        double average = sum/(double)total;
        System.out.println("numbers: "+ Arrays.toString(numbers));
        System.out.println("sum: " +sum);
        System.out.println("average: "+df.format(average));

    }
}
