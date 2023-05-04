package Day30_InhertianceContinue.phoneTask;

public class iPhone extends Phone {


//constructor:
public static boolean hasApplePay = true;

    public iPhone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public  void faceTime(long phoneNumber){
        System.out.println( getModel() +" is face timing with " +phoneNumber );
    }

    public void faceTime(String email){
        System.out.println( getModel() +" is face timing with " + email );
    }


}
