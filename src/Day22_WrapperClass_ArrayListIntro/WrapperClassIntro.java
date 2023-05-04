package Day22_WrapperClass_ArrayListIntro;

public class WrapperClassIntro {
    public static void main(String[] args) {
        String str = "java";

        int a1 = 10;//primitive, can not be used in all data structures
        Integer a2 = 10;  //wrapper class, can be used in all data structures

        int b1 = 100; //convert this primitive to wrapper:
        Integer b2 = b1;

        char ch = 'A'; //convert into an object (autoboxing)
        Character ch2 = ch;


    }
}
