package Day24_ArrayListContd_DateTimeIntro;

import java.util.Arrays;
import java.util.Collections;

public class frequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbccccc";
        String result = "";

        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if (!result.contains(each)) {
                result += each + frequency; //ADDS character and
            }
        }

        System.out.println(result);
    }
}
