package Day37_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println(9/0); //arithmetic exception
        }catch (RuntimeException e){
            System.out.println("runtime exception has been caught");//this can  successfully handle the above exception

          //  System.exit(1);  using this exit method would prevent finally block from executing
        }finally{
            System.out.println("finally block"); //will STLL get executed even though exception was successfully handled above
        }




    }
}
