package Day04_Concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {


        //-------------implicit casting -------------
        byte a = 15;
        short b = (short) a;
        System.out.println(b);
/* short b = (short)a;  this type of casting is done implicityly,
the smaller variable type is cast to the larger variable type b/c
the larger variable type will always have the range of value that the smaller one contains.
 */
        long d = 3000L;
        //remember lower or uppercase L tells computer this value is long and not just an INT variable.
        System.out.println(d);

        //-------------implicit casting :-------------
        System.out.println("____________________");
        int x = 100;
        byte y=(byte)x; //since x's value is larger than BYTE, it cannot be assigned to byte unless you put the type you are trying to cast to in the ( ) next to x.  Then this reassigns the larger value to a smaller variable.
        System.out.println(y);
//now if you print y variable, it will print as the x int value (100)
        float z = 20.8f;
        short q =(short)z; //z=20.8 -> what happens if this is cast to short? it only takes integer value. so when you print, the result will be 20.

        System.out.println(q);

        System.out.println("____________________");


        int num=500;
        byte result = (byte)num; //explicit casting.
        //it is not possible for byte to contain 500, since you are assigning a larger number to a smaller variable, it will give you negative number. dot worry about the byte code calculations now, the computer will reassign the value automatically.
        System.out.println(result);


        int r=50000;
        short t=(short)r;
        System.out.println(t);
    }
}
