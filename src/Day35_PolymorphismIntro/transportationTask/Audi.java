package Day35_PolymorphismIntro.transportationTask;

public abstract class Audi extends Car implements AutoPark {
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


}
