package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;

public class frequencyOfJava {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        sentence=sentence.toLowerCase(); //converts sentence to lowercase so you dont have to worry about case sensitivy


        String word = "Java";
        word =word.toLowerCase();
        int count = 0;

while(sentence.contains(word)){
count++;
sentence = sentence.replaceFirst(word, ""); //replaces word with empty string to end the loop. occurs 1x per loop execution

        }

        System.out.println(count);



    }
}
