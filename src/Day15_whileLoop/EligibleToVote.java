package Day15_whileLoop;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your age: ");
        int age = input.nextInt();

        while (!(age>=1 && age <=120)){
            System.err.println("invalid age, please re-enter your age:");
            age = input.nextInt();
        }

        System.out.println("are you a US citizen?  ");
        String yesOrNo = input.next();
        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))){
            System.out.println("invalid entry, please re-enter. US citizen, yes/no?:");
            yesOrNo = input.next();
        }

        if (age>=18 && age <120){
            if (yesOrNo =="yes") {
                System.out.println("eligible to vote");
            }
        }else{
            System.out.println("not eligible age");
        }






    }
}
