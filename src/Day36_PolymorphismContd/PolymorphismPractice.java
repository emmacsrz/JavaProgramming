package Day36_PolymorphismContd;

import Day30_InhertianceContinue.phoneTask.Nokia;
import Day30_InhertianceContinue.phoneTask.Phone;
import Day30_InhertianceContinue.phoneTask.Samsung;
import Day30_InhertianceContinue.phoneTask.iPhone;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Phone [] phones = {
                new iPhone( "Iphone 11 Pro", "Large", "Black", 900),
                new iPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new iPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new iPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new iPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new iPhone("Iphone 6", "Smalle", "Gold", 400),
                new iPhone("Iphone 7", "Smalle", "White", 500)
        };

        for (Phone each : phones){
            System.out.println(each.getModel() + "-"+ each.getColor() + "-"+  each.getPrice());
        }

        int countIphones=0,
                countSamsungs=0,
                countNokias=0;


        for (Phone each : phones) {
            if (each instanceof iPhone){
                countIphones++;
            }else if(each instanceof Samsung){
                countSamsungs++;
            }else if(each instanceof Nokia){
                countNokias++;
            }
        }

        System.out.println("# of iphone: "+countIphones);
        System.out.println("# of Samsung: "+countSamsungs);
        System.out.println("# of Nokia: "+countNokias);
        System.out.println();
        System.out.println();
        System.out.println("list of phones $700 or less:");


        for (Phone each : phones) {
            if( each instanceof iPhone || each instanceof Samsung){ // if the phone is Iphone or samsung
                if(each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }


        // ==,  .equals()



    }
}
