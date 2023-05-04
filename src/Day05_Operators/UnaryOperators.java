package Day05_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        //PRE INCREMENT:
        int x = 10;
        System.out.println(x);
        //in the memory, the value of x is 10.  If we apply increment operator as pre increment here is what happens:
        System.out.println(++x); //changes the value by 1 immediately, the value of x now becomes 11
        //it does not change the ones in lines BEFORE  you use pre increment.  Since java reads top to bottom
        System.out.println(x);

        //PRE DECREMENT:
        int y = 100;
        System.out.println(--y);  //prints as 99
        System.out.println("**************************");
//*************************************************************
        //post increment:

        System.out.println(x++);  //if you apply increment or decrement POST, it does not take affect immediately. It will take affect in the next print: (this print statement will print as 11, but the next will print as 12).
        System.out.println(x);
//*************************************************************
        System.out.println("**************************");
        int a = 50;
        System.out.println(a++); //prints as 50, however, next one will print as 51:
        System.out.println(a);
//*************************************************************
        System.out.println("**************************");
        int n = 30;
        int m = n++;  //m = 30

        System.out.println("m = " + m);
        System.out.println("n = " + n);

//*************************************************************
        System.out.println("**************************");
        int z = 60;
        int q= z--;
        System.out.println("q = " + q);
        System.out.println("z = " + z);


    }
}
