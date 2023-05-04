package Day13_CustomMethodsContd;

import java.util.Scanner;

public class QuestionOfTheDay {
    public static void main(String[] args) {

        //WRITE YOUR CODE BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");

        if (firstBread == lastBread) {
            System.out.println("nothing");
        } else {
            System.out.println(str.substring(firstBread + 5, lastBread));
        }



        /*


        if(str.startsWith(str.indexOf("bread" ))) {
            str = str.substring(5,str.indexOf("br")-2);
        }

        if(str.endsWith("bread")){
            str =str.substring(str.lastIndexOf("bread"), str.length()-1);
        }

        System.out.println(str);


         */
    }
}
