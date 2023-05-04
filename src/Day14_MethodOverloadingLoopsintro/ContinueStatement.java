package Day14_MethodOverloadingLoopsintro;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("---------");


        for (int i = 10; i < 21; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---------");


        for (char i = 'A'; i <= 'G'; i++) {
            if (i == 'B' && i == 'E')
                continue;
            System.out.println(i);
        }


        System.out.println("---------");

        for (int i = 0; i < 10; i++)
            System.out.println("hello world"); // if you have only one statement in the for loop, you can declare without curly brackets like so, but it is not considered good practice.






    }
}
