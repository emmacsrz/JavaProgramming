package Day32_FinalKeyword.CarTask;

public class Car {
    private String make, model, color;
    private int year;
    private double price;
    public static boolean hasBattery;
    public static int numberOfWheels = 4;




    public Car(String model, String color, int year, double price) {
        setMake( getClass().getSimpleName() ); // setting the class name to the make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    static {
        hasBattery=true;
        numberOfWheels = 4;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<=0){
            System.err.println("invalid year");
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public  void start(){
        System.out.println("Press the brake and twist the key in ignition to start the "+make+" "+model);
    }



    @Override
    public String toString() {
        return make+"{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", Has Battery? =" + hasBattery +
                ", Wheels=" + numberOfWheels +
                '}';
    }
}
