package Day09_Scanner;

import java.util.Scanner;

public class daysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the day number: ");

        // int num= new Scanner(System.in).nextInt(); //if you use this,  after this step, scanner object will be gone.

        int num = input.nextInt();

        String day = "Invalid";

        if (num >= 1 && num <= 7) {
            day = (num == 1)? "monday" :(num == 2)? "tuesday" :(num == 3)? "wednesday" :(num == 4)? "thursday" :(num == 5)? "friday" :(num == 6)? "saturday" :"sunday";

        }
        System.out.println(day);

        input.close();

    }
}
