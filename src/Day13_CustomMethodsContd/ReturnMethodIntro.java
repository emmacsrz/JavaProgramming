package Day13_CustomMethodsContd;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        sum(20, 40); //void method

        int total = addition(10, 20); //return method
        System.out.println(total);


        int squarenum = numSquared(5);
        System.out.println(squarenum + " squaredd = " + squarenum);
        System.out.println(numSquared(5));
    } //main method end

    public static void sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(result);
    }//sum method end

    public static int addition(int n1, int n2) {
        int result = n1 + n2;
        return result;

    }//addition method end

    public static int numSquared(int num) {
        int square = num * num;
        System.out.println(num + " squared =" + square);
        return square;

    }//numSquared method end


}//class end
