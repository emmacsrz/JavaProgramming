package Day38_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) {

    }


    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }


    public static void method1(){
        System.out.println("Hello World");
        try {
            pauseFor5Seconds();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello Cydeo");
    }


    public static void method2() throws FileNotFoundException, InterruptedException {
        System.out.println("first program started");
        Thread.sleep(3000);
        System.out.println("first program ended ");

        new FileInputStream("");

        Thread.sleep(5000);
    }





}
