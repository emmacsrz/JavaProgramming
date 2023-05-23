package Day35_PolymorphismIntro.transportationTask;

import Day34_AbstractionAndInterface.animalTask.Flyable;
import Day34_AbstractionAndInterface.animalTask.Swimmable;

public abstract class CydeoCar extends Car implements AutoPilot, Flyable, Electric, Swimmable {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void charge() {

    }
}
