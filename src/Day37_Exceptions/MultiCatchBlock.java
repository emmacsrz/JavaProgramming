package Day37_Exceptions;

import Day35_PolymorphismIntro.transportationTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {

        System.out.println("Program1 started");

        Car car = null;

        try {
            car.drive(); // NullPointerException

        }catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }


        System.out.println("Program1 ended");
        System.out.println("------------------------");
        System.out.println("Program2 started");
        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace();

        }


        System.out.println("Program1 ended");

        System.out.println("-------------------------------------------------------");
        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program3 ended");



  /*
        try{

        }catch (RuntimeException e){

        }try{

        }try{

        }try{

        }

   */



    }
}
