package Day14_MethodOverloadingLoopsintro;

public class forLoopIntro {
    public static void main(String[] args) {


//sum of numbers 1-100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.print(sum+ ", ");
        }
        System.out.println();
        //------------------------------------------------

        //to print all the alphabet letters a-z
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        //------------------------------------------------
        System.out.println();


        for (char i= 'z'; i >='a'; i--) {
            System.out.print(i + " ");
        }

    }//end main method
}//end class
