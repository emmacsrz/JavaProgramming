package Day24_ArrayListContd_DateTimeIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsWarmup {
    /*
        2. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
     */
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();


        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(list);


//to remove elemnts you need to use iterable.
        /*
        ArrayListName.removeIf( variable name,  usually just “p” preferred, then -> to tell compiler you are giving lambda expression, then give condition p <4  )
This will be:
ArrayListName.removeIf(p -> p <4) ;   —this will remove integer elements that are less than 4.
         */
        list.removeIf(p-> p >4);
        System.out.println(list);

        System.out.println("---------removeIf with String: -------------------");

      ArrayList<String> names = new ArrayList<>();

      names.addAll(Arrays.asList("spongebob", "patrick", "squidward", "mrCrabs"));

      names.removeIf(each -> each.startsWith("s") );

        System.out.println(names);




    }
}
