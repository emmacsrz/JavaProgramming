package Day20_ArrayContdForEachLoop;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        //reverse a sentence, not characters:  IE:  "I love java"  to "java love i"

        String sentence = "I love Java";
        System.out.println(sentence);
        String[] words = sentence.split(" ");//split method splits the string at the spaces
        String[] reversed = new String[words.length];
        // Loop through the words in the original sentence
        for (int i = 0; i < words.length; i++) {
            // Add each word to the beginning of the reversed sentence array
            reversed[words.length - i - 1] = words[i];
        }

        // Join the words in the reversed sentence array into a single string
        String reversedSentence = String.join(" ", reversed);

        System.out.println(reversedSentence);
        System.out.println("------------------------");
//using reverse custom method:
        String sentence2 = "I love Java It's the Best";
        System.out.println(sentence2);
        String[] words2 = sentence2.split(" ");
        System.out.println(Arrays.toString(ArraysUtility.reverse(words2))); //getting the sentence to print in reverse
        String[] reverse2 = new String[words2.length]; //initializing a new array to hold the reverse sentence, the size is words2.length, so it can contain every word in that sentnece.
        reverse2 = ArraysUtility.reverse(words2);//assigning the values to the elements of the array.
        System.out.println(Arrays.toString(reverse2));//printing new array


    }
}