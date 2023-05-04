package Day19_ArrayIntro;
import java.util.Arrays;
public class MyGroup {
    public static void main(String[] args) {
        String[] group = new String[5];
        group[0]= "me";
        group[1] = "unicorn";
        group[2] = "spongebob";
        group[3] = "hotdog";
        group[4] = "frenchfry";

        System.out.println(Arrays.toString(group));

        System.out.println("----------------------");

        for (int i = 0; i <5; i++) {
            System.out.println(group[i]);
        }

        group[0]= "emma"; //changes 1 to a new value.
        System.out.println(Arrays.toString(group));
        System.out.println("----------------------");

        //array in reverse:
        for (int i = group.length-1; i >=0 ; i--) {
            System.out.println(group[i]);
        }

        System.out.println("----------------------");

        for (int i = 0; i < group.length; i++) {
            System.out.println(group[i]);
        }

        System.out.println("----------------------");
        for (int i = group.length - 1; i >= 0; i--) {
            System.out.println(group[i]);
        }





    }
}
