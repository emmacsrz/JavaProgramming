package Day14_MethodOverloadingLoopsintro;

public class OverloadingMainMethod {
    public static void main(String[] args) {

        System.out.println("A");
    }

//you are NOT supposed to overload main method, there is no point.  You cannot use an overloaded main method to run your java file.
    public static void main(int[] args) {
        System.out.println("A");
    }

    public static void main(double[] args) {
        System.out.println("B");
    }

    public static void main(boolean[] args) {
        System.out.println("C");
    }

}