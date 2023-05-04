package Day30_InhertianceContinue.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {
        iPhone iphone = new iPhone("iphone12", "mini", "Black", 1000);

        Samsung samsung = new Samsung("galaxy", "large", "White", 1200);

        Nokia nokia = new Nokia("brick", "small", "Pink", 50);



        iphone.call(911);
        samsung.call(211);
        nokia.call(411);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);



    }
}
