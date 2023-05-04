package Day11_StringContd;

public class StringMethods1 {
    public static void main(String[] args) {

        //tolowercase method:
        String str1 = "JAVA";
        System.out.println(str1.toLowerCase()); //converts uppercase to lowercase --keep in mind, this is not PERMANENTLY making the variable's value lowercse, b/c string values are IMMUTABLE, you cannot change it like this, you will need to update it again like so (see next example):

        //you can  reassign the lowercase value to the original variable like this:
        str1 = str1.toLowerCase();   //this is reassigning the new value to the variable.
        //now, the str1 variable will always print as lowercase.
        //=-------------------------------------

        String str2 = "java programming";
        System.out.println(str2);
        str2 = str2.toUpperCase();
        System.out.println(str2);

        // ---------------------------

        String sentence1 = "today is sunday, and we have Java Class";
        //in order to find the index # from a string:
        System.out.println(sentence1.indexOf('w'));  ///returns 21 for index number

        //assigning this to a variable:
        int indexofW = sentence1.indexOf('w');
        System.out.println(indexofW);


//finding multiple matching characters :

        String s1 = "I love java programming ";
        int firsta = s1.indexOf('a');
        System.out.println(firsta); //prints 8 --> index no of the first a

        //--> finding the second a:
        int seconda = s1.indexOf("a ") ; //-->looks for an "a" with a space immediately after it.
        System.out.println(seconda); //-->prints 10 - index number of the second a

        int thirda = s1.indexOf("am"); //-->defines what you are looking for, an 'a' next to an 'm'
        System.out.println(thirda); //-->prints 17



    }
}
