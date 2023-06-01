package Day37_Exceptions;


import Day31_InheritanceContd.shape_methodOverriding.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza('s', 2, 3);
        Pizza pizza2 = new Pizza('s', 2, 3);

        System.out.println(pizza1 == pizza2); //false bc they are created with new keyword, so separate objects
        System.out.println(pizza1.equals(pizza2)); //returns true, this method is overriden in pizza class.  compares the if they are both pizza objects


//        System.out.println(pizza1.equals(100)); //returns false

        Object obj = new Pizza('s', 2, 3);

        boolean r = obj.equals(pizza2);

        System.out.println(r);

        double total = ((Pizza) obj).calcCost();

        System.out.println(total);

        double area = ((Circle) obj).area();

        //   System.out.println(area);

        System.out.println("Test Completed");

    }
}




