package Day14_MethodOverloadingLoopsintro;

public class MethodOverloadingPractice {
    public static void main(String[] args) {


        System.out.println(sum(1,5));
        System.out.println(sum(1,5,7));
        System.out.println(sum(1,6,8,9));
        System.out.println(sum(.5,.3,.4));


    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return sum(a, b) +c ;
    }

    public static int sum(int a, int b, int c, int d){
        return sum(a, b, c) + d;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }



}
