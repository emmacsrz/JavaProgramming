package Day23_ArrayListContinued;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;

public class FindUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(6);
        System.out.println(list);


        for (Integer element : list) {
            int frequency = 0;
            for (Integer each : list) {
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
            }
        }






    }
}
