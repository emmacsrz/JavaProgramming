package Day05_Operators;

public class RelationalOperators2 {
    public static void main(String[] args) {
        //== double equal. wil return true as long as both values are equal. IE;
        System.out.println(100 == 200); //false
        System.out.println(200 == 200); //true
        System.out.println("java" == "JAVA"); //returns false. Remember Java is a case sensitive language
        System.out.println("muhtar" == "good guy"); //returns false, bc muhtar is not the same as "good guy"

        System.out.println("----------------------");

        // != not equal operator.  Opposite of equal.  This will only return "true" if the two values are NOT equal
        System.out.println(100 != 200); //true
        System.out.println(200 != 200); //false
        System.out.println("java" != "JAVA"); //returns true. Remember Java is a case sensitive language
        System.out.println("muhtar" != "good guy"); //returns true, bc muhtar is not the same as "good guy"
        System.out.println(true != false); //true.  true does not equal false - this is a true statement




    }
}
