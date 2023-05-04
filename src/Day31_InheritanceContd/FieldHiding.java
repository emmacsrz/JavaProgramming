package Day31_InheritanceContd;
class A{ //parent class
    public int a =100;
}

public class FieldHiding extends A {  //child class
    //field hiding is only between parent and child class
    public int a = 300;   //same name of variable above.  Therefore, int a from the above class is NOT inherited to this class.  It is hidden.

    //printing the variable "a" in the child class:
    public static void main(String[] args) {
        System.out.println(new FieldHiding().a);  //output is 300, because "a" from "A" class is NOT inherited.
    }

}
