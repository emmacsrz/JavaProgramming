package Day37_Exceptions;

public class ExceptionsIntro {

    public static void main(String[] args) {
        String str = "java";

//        char ch = str.charAt(250); //will cause index out of bounds exception, executes status code 1, which is exit
//
//        System.out.println(ch);  //will not get executed because exception occurs at line 8



        Pizza pizza= null;
//        pizza.calcCost(); //causes null pointer exception b.c there is no object defined above in line 14 at Pizza. There is only a reference variable pointing to a null object.

        System.out.println(50/0) ;  //unchecked exception


        System.out.println("Hello World");




    }
}
