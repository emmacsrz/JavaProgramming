package Day34_AbstractionAndInterface.CarTask;
public abstract class Car { // meat to be inherited, can not be instantiated

    private final String make, model;
    private String color;
    private final int year;
    private double price;

        public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); // to set the class name to the make of the car
        this.model = model;
        setColor(color);
        if (year < 1886) {
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }


    protected final void stop(){ // to make sure that non-sub classes outside the package can not access it
        System.out.println("Press the brake to stop " + make +" "+model);
    }

    protected abstract void start(); // meant to be overridden

    @Override
    public String toString() {
        return make +"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }



}
