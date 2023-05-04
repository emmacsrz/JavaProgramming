package day06_ifStatements;

public class operatorPrecedence {
    public static void main(String[] args) {
        System.out.println(5 + 2 * 3);
        //                  5+6 - java calculates the multipliation first, then addition. so answer will be 11.


        System.out.println(7 + 3 - 2 / 2); //division is calculated first
        //                  7+3 -1  --addition an subtraction have same order of precendence, so whichever comes first will get executed first.


        System.out.println(-5 + 3 ); //unary minus and addition. Unary minus has highest order of precendence, so that will be executed first.
        //                  -5 + 3 = -2


        System.out.println(10 > 9  == 8 <7 );  // ==  has lowest order of precedence, >< have higher order and come first.
        //                  true == false  is true equal to false? NO.  will return a false answer.

        System.out.println(10 > 9  == 8 <7 && "Java" == "Python" || 'a'== 'A');
        //                  true == false  && Java == Python  || a ==  A
        //                  false        &&    false       ||    false         -logical "and" is higher in precedence, so execute that first
        //                         false || false
        //                                false

        System.out.println( 100 >= 20 && 40 *2 > 60); //do multiplication first, then the > < parts of statement:
        //                     true && 80 > 60
        //                      true && true
        //                          true


        int a =20;
        System.out.println("a = " + a);
//changing the value of A by a specified number using addition assignment operator:
        a +=10 +2 *3;
//      a += 10 + 6
      //a += 16
      //a now equals 36, because we increased its original value of 20 by 16.
        System.out.println("a = " + a);



    }

}
