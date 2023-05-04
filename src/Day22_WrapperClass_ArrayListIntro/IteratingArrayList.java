package Day22_WrapperClass_ArrayListIntro;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(3, 255);

//iterating using for loop:
        System.out.println("iterating using for loop:");
        System.out.println(numbers);
        for (int i = 0 ; i< numbers.size(); i++){
          int each =   numbers.get(i); //.get method reterieves elements, (i) will change each time the loop is repeated,
            System.out.println(each);
        }


        System.out.println("-----revere order:----------------");



//iterating in reverse order:
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
        System.out.println("-----------for each loop:--------------------");
//iterating using for each loop:
        for (Integer each : numbers) {
            System.out.println(each);
        }


    }
}
