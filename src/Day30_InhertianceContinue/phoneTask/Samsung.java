package Day30_InhertianceContinue.phoneTask;

public class Samsung extends Phone {

    public Samsung(String model, String size, String color, double price) {
        super("samsung", model, size, color, price);
    }

    public void freeze(){
        System.out.println(getBrand() + " "+ getModel() + " freezes a lot");
    }






}
