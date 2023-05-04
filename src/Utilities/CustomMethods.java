package Utilities;
//This class is for storing custom methods for future use.


public class CustomMethods {
    public static void main(String[] args) {

    }//main method end
    public static String reverseIt(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {  //finds the index numbers in reverse
            reverse += str.charAt(i); //finds characters associated with those index numbers in the order specified above. updates the "reverse" variable.
        }
        return reverse;
    }//reverseIt method  end



}//class end

