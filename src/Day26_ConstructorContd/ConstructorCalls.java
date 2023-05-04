package Day26_ConstructorContd;

import org.w3c.dom.ls.LSOutput;

public class ConstructorCalls {
//default constructor:
    public ConstructorCalls() {
        System.out.println("Default Constructor");
    }


    //overloaded constructor:
    public ConstructorCalls(int a){
        this(); //calls default constructor
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        this();
        System.out.println("constructor with double argument");
    }







    public static void method1() {
        System.out.println("Method 1");
    }

    public static void method2() {
        method1();
        System.out.println("Method 2");
    }


}
