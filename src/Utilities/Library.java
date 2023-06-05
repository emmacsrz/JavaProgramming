package Utilities;

public class Library {

    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long)(seconds *1000L)); //sleep method only takes miliseconds, so we are converting the (double) seconds into (long) mili seconds
    }
}
