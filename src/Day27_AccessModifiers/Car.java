package Day27_AccessModifiers;
//nested class examples:

public class Car { //outer class
    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;


    public class CarEngine { //inner class, in order to have a car engine, you have to have the first outer class object first (car)

        public void method() {
            System.out.println(make);
            System.out.println(wheels);
        }

    }



}
