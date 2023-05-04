package Day08_Ternaries_SwitchStatements;

import org.w3c.dom.ls.LSOutput;

public class Ternaries_Intro {
    public static void main(String[] args) {

        int score = 55;
        String result = " ";
        result = (score >= 60 && score <= 100) ? "passed " : "failed ";
        System.out.println(result);
        System.out.println("----------------------------------");


        int age = 18;
        String eligible = " ";
        eligible = (age >= 21) ? "eligible" : "not eligible";
        System.out.println(eligible);
        System.out.println("----------------------------------");


    }


}
