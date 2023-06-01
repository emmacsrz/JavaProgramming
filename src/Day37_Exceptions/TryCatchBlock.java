package Day37_Exceptions;

public class TryCatchBlock {

    public static void main(String[] args) {
        System.out.println("program started");


try{
    System.out.println(9/0); //intentionally created exception
    System.out.println("try block");
}catch (Exception e){ //if try block cannot fix or handle above exception, the catch block will be executed. You must put the correct exception in this paramter in order for the compiler to handle it correctly.  Anything that has an Is A relationship with the exception will handle it correctly.  (Check chart)

    System.out.println("catch block");
}
        System.out.println("program ended ");
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {

            System.out.println(str.toLowerCase());
            System.out.println("Try Block");

        }catch (RuntimeException e){
            System.out.println("Catch Block");
        }


        System.out.println("Program2 ended");

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Program3 started");

        try {

            Thread.sleep(5000);
            System.out.println("Try Block");

        }catch (InterruptedException e){

            System.out.println("Catch Block");

        }

        System.out.println("Program3 ended");



    }
}
