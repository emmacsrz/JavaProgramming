package Day11_StringContd;

public class StringMethods2 {
    public static void main(String[] args) {
        String sentence = "i love python, python is the best programming language, and python is in high demand";
        System.out.println(sentence);
        String newSentence = sentence.replace("python", "java");
        System.out.println(newSentence);

//------------------------------

        String word = "java";

        String word2 = word.replace('a', 'e');

        System.out.println(word2); //prints jeve instead of java

//----------------------------
        //substring method:
        System.out.println("-------------------");
        String sentence4 = "i love java programming";
//in order to get substring from this, you need to know index #s of J and A (beggining and ending index numbers of "java")

        String languageName = sentence4.substring(7, 10 + 1);//will print "jav" if you use 7 and 10 (actual index numbers),, because substring ALWAYS excludes last number.  If you want to print the full "java", you need to + 1, or give 11 as ending index number.
        System.out.println(languageName);

//----------------------------
        //substring method:
        System.out.println("-------------------");

        String sentence5 = "today is sunday, tomorrow is monday";
        System.out.println(sentence5);
        String sundaySubString = sentence5.substring(9, 14 + 1); //even though sunday technically ends on index number 14, we usd 15 to add an extra one because sub string always excludes last index number
        System.out.println(sundaySubString);


        System.out.println("-------------------");

        //create a substring that will get you email domain.  Should you count each character one by one to get domain index numbers? NO.  You can find domain after @ sign.
        //How to find index number of @ symbol:
        String email = "emma@gomotorsusa.com";
        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');
        String domain = email.substring(beginning, ending);
        System.out.println(domain);

        System.out.println("-------------------");
        //repeat method:

        String str = "python";
        //we want to create a new string where it contains concatenation of the above string 10 times (Repeated 10 times)
        // String result = str.repeat(10);   ---> this will return python 10 times, but without spaces. in order to have spaces type it like this:
        String result = (str+"\n").repeat(10); //for each to print on line.

        System.out.println(result);





    }
}
