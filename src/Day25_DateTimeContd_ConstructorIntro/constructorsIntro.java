package Day25_DateTimeContd_ConstructorIntro;

public class constructorsIntro { //there is a constructor in this class even before we call any methods, main method, etc. The constructor that exists before that is known as "no-argument" constructor. it does not pass any parameters.


    //constructor must be SAME name as class name
    //you do not use constructor for returning any value.   Not void or other data types.   It also cannot have specifiers like static or void

    public constructorsIntro(int a){ //benefit of defining construcor by yourself vs letting compiler do it, is that you will be able to group certain code fragments to execute certain tasks within the body of the constructor
        System.out.println("object is created by using default constructor");

    }


public static void add(){ //this is example of defining a regular method, instance method, etc.

}

    public static void main(String[] args) {

        constructorsIntro obj = new constructorsIntro(10 );





    }
}
