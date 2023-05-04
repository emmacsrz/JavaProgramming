package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        //write a program that finds the characters which only appear twice, not more not less.
        String str = "aaabbccccddeeeeff";

        String result = "";


        for (int j = 0; j < str.length(); j++) {  //outer lop
            char ch = str.charAt(j); //each character of char str

            int count = 0;

            for (int i = 0; i < str.length(); i++) { //inner loop
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if(count ==2 && !result.contains(""+ch)){
                result += ch;
            }
        }

        System.out.println(result);
    }
}
/*  here is how the logic of this program works:
The program first creates a string variable str with the value "aaabbccccddeeeeff". This is the string in which we want to find the characters that appear exactly twice.
Next, the program creates an empty string variable result. This variable will hold the characters that appear exactly twice in the string.
The program then starts an outer loop that iterates over each character in the str string. This outer loop is implemented using a for loop that declares an integer variable j and sets its initial value to 0. The loop continues until the value of j is less than the length of the str string.
Within the outer loop, the program retrieves the current character at the j index of the str string using the charAt method and assigns it to a character variable ch.
The program then starts an inner loop that iterates over each character in the str string. This inner loop is implemented using another for loop that declares an integer variable i and sets its initial value to 0. The loop continues until the value of i is less than the length of the str string.
Within the inner loop, the program checks if the current character at the i index of the str string is equal to the ch character. If it is, then the program increments a counter variable count.
After the inner loop completes, the program checks if the count variable has the value 2, which means the ch character appeared exactly twice in the str string.
If the count variable is 2 and the result string does not already contain the ch character, then the program appends the ch character to the result string.
Finally, the program prints the result string, which contains all the characters that appeared exactly twice in the str string.

 */