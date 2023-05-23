package Day35_PolymorphismIntro.transportationTask;

import Day34_AbstractionAndInterface.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {
    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    public void land(){
        System.out.println("the plane is landing");
    }

    @Override
    public void fly() {

    }
}
