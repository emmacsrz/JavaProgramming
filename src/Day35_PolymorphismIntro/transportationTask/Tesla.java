package Day35_PolymorphismIntro.transportationTask;

import Day34_AbstractionAndInterface.animalTask.Flyable;

public abstract class Tesla extends Car implements AutoPilot, Electric {
    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


}
