package Day40_CollectionsContd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
List<String> names = new ArrayList<>();
names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        System.out.println("with palindromes: "+ names);

Iterator <String> it = names.iterator();

while(it.hasNext()){  //returns true as long as there is another element to retrieve
    String each = it.next(); //each is assigned to it.next

    String reverse = "";

    for (int i = each.length()-1; i >=0 ; i--) {
        reverse +=each.charAt(i);
    }

    if (each.equalsIgnoreCase(reverse)){  //if normal word = the same word in reverse, it is a palindrome and we remove it
        it.remove();
    }

}

        System.out.println("without palindromes: "+names);


        System.out.println("---------------------------");

        //doing the same task with lambda expressions instead:

//        List<String> names2 = new ArrayList<>();
//        names2.addAll(
//                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
//        );
//
//        names2.removeIf(p -> StringUtility.reverse(p).equalsIgnoreCase(p));
//        //  names2.removeIf( p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p) );
//
//        System.out.println(names2);
        

    }
}
