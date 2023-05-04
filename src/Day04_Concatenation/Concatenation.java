package Day04_Concatenation;

public class Concatenation {
    public static void main(String[] args) {
        String name = "alexander";
        int age =35;
        int salary=85_000; //remember, you cannot use commas for numbers, use underscore to make them more readable.
        System.out.println("hello " + name); //make sure you include space in quotation marks before concatenation. otherwise it will print with no space between "hello" and "alexander".  You can add more text after variable, see below:
        System.out.println("hello " + name +
                ", My name is bob, I am "+age + " years old.  " +
                "my annual salary is " + salary+ " per year");
    /*the act of joining the variable's information in the string of text is called concatenation*/

    }


}
