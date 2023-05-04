package day02_EscapeSequences;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Hello Everyone\ntoday we have java class.");
    System.out.println("_________________________");
    System.out.println("\t Java programming language");
    //backslash  slashes are reserved by escape sequences
        //in order to print a \\  you must use double back slash \\ like so:
        System.out.println("\t \\");
        //in order to use "" double quotes:
        //double quotes are reserved by string of text in java
        // so you must use \ before the quote""
        System.out.println("my favorite TV show is \"Star trek\"");

        /*
        1. \n - new line
        2. \t -program space
        3. \\ - back slash
        4. \" for quotes
         */
    }
}
