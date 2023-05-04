package Day05_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //Assignment operator:
        int a = 20;
        System.out.println(a);
        /*20 is stored to the variable A, whenever it is used on any line below this it will have a value of 20.
          What if we no longer need 20 after a specific line?  We need a different number but still need to be able to use the A variable.  To change the subsequent variables, we do this:
         */
        a = 40; //new assignment to the same variable a. We do not need to use "int" again.
        System.out.println(a);
        //-----------------------------------------
//scenario: you have $100 in your bank account but want to deposit $1000:
        double balance = 100;
        balance+=1000;  //addition assignment operator
        System.out.println(balance);

        balance+=500; //adding another 500 to balance
        System.out.println(balance);

        //subtracting assigment operator:
        balance-=300; //subtracting  300 from balance
        System.out.println(balance);

        balance=100; //resetting the variable back to 100

        //multiplying assigment operator:
        balance*=2; //multiplying balance by 2, should print 200
        System.out.println(balance);

        //division assigment operator:
        balance/=4; //dividing balance by 2, should print 50
        System.out.println(balance);

        balance=100; //resetting the variable back to 100

        //remainder assigment operator:
        balance=100%3; //prints 1, because 100/3 is 99 with 1 remainder.
        System.out.println(balance);


    }
}
