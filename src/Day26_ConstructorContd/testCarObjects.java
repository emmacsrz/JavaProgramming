package Day26_ConstructorContd;

public class testCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        System.out.println(car1);

        Car car2 = new Car("Toyota", "mr2");
        System.out.println(car2);

        Car car3= new Car("BMW", "330i", 2004);
        System.out.println(car3);

        Car car4= new Car("lexus", "ls400", 1999, 5000, "black");
        System.out.println(car4);



    }
}
