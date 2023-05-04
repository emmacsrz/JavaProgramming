package Day10_ScannerAndString;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = "Cydeo"; //this string is the combination of 5 characters, the "C" being 0 in index no,, and "o" being 4.
        //retrieving a character using charat method:

        char firstChar = str.charAt(0); // will return C.
        System.out.println(firstChar);

        char second = str.charAt(1);
        System.out.println(second);//returns y

        char third = str.charAt(2);
        System.out.println(third);

        char fourth = str.charAt(3);
        System.out.println(fourth);

        char fifth = str.charAt(4);
        System.out.println(fifth);

        System.out.println("-----------------------------");
//counting characters using Length() method:
        String sentence =  "Java programming language";  // remember, spaces are included in string.
        int length= sentence.length();
        System.out.println(length);
        int lastIndex =  length -1;
        System.out.println(lastIndex);

        System.out.println("-----------------------------");
        //write a program that finds first and last characters.
        String s1 = "wooden spoon";

        char f =s1.charAt(0);
        int lastIndexNum = s1.length() -1 ;
        char l = s1.charAt(lastIndexNum);

        System.out.println("first character = " + f + " last character = " + l );

        System.out.println("-----------------------------");
        String name1 = "umran";
        String name2 = new String("umran");

        System.out.println(name1==name2); //compares the objects as they are in the memory (thus, returning false b/c they are stored in 2 different memory allocations.
        System.out.println(name1.equals(name2)); //compares the text as they are, thus resulting in true









    }
}
