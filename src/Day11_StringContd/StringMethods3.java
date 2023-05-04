package Day11_StringContd;

public class StringMethods3 {
    public static void main(String[] args) {
//isEmpty method:  spaces count.  Will return false unless it is completely empty, free of all characters and spaces.
        String word = "";
        boolean r1 = word.isEmpty();
        System.out.println(r1);
//----------------------------
        //isBlank method:  Will return true if there are no characters other than spaces.
        String word2 = "    ";
        boolean r2 = word2.isBlank();
        System.out.println(r2);

//----------------------------
       // equals method:
String str1 = "cydeo";
String str2 = new String("cydeo"); //not the same as the one above. They are stored in different memory allocations.
        System.out.println(str1 ==str2); //returns false, b/c they are NOT the same object
        System.out.println(str1.equals(str2)); //returns TRUE b/c they ARE the same text.  This is what this is comparing.
//----------------------------
        //contains method:

    }
}
