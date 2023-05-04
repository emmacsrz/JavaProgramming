package Day27_AccessModifiers;

public class testCircleObjects {
    public static void main(String[] args) {

        Circle circle1 =new Circle(3.5); //other values will be calculated, output will be: {radius=3.5, diameter=7.0, PI=3.14, area=38.465, perimeter=21.98}
        System.out.println(circle1);

        System.out.println(circle1.calcArea());

        System.out.println(Circle.pi); //calling pi through tthe class that it is initialized in








    }
}
