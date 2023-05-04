package Day23_ArrayListContinued;

import Utilities.ArraysUtility;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

//addAll method:
        //addAll method allows you to add one collection to the arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // list1.addAll(numbers); //will add them after the last index, if you want to add them at a speciifc index do so like this:
        list1.addAll(1, numbers); //will insert the elements from numbers at index 1, and push other numbers to the right
        //note, you can only pass 1 argument in the addall method. You cannot use multiple values
        System.out.println(list1);


        System.out.println("----------------asList Method:----------------------");
//asList() Method
        //in order to pass multiple arguments as a collection type, use AsList method, returns a list  which is a collection type.  The list contains the specified elements
        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 95, 100)); //whatever you pass into addAll must be a collection.
        //now the scores arraylist will contain [75, 85, 95, 100]   as elements.

        System.out.println(scores);

        System.out.println("----------------asList Method with string :----------------------");
        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("spongebob", "unicorn", "sprinkles", "emma")); //the Arrays.asList converts the arguments as collection into a single argument The addAll() method of the ArrayList class is used to add multiple elements to the ArrayList at once. It takes a Collection as an argument, which is why the Arrays.asList() method is used to convert the array of strings to a List of strings.

        //  Without the Arrays.asList() method, you would not be able to pass an array of strings directly to the addAll() method, as the method expects a Collection, not an array. Therefore, the Arrays.asList() method is necessary in this case to convert the array of strings to a List of strings that can be added to the ArrayList using the addAll() method. (collection types are either list, que, or set)
        System.out.println(students);
        students.addAll(2, Arrays.asList("joe", "bob", "jane"));
        System.out.println(students);


        System.out.println("----------------converting array to ARraylist :----------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8}; //the array MUST be a non-primitive(Integer NOT int)
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));

        System.out.println(l1); //output will be [1, 2, 3, 4, 5, 6, 7, 8]



        System.out.println("----------------contains and containsAll methods:----------------------");
        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("spongebob", "unicorn", "chancho"));
        System.out.println(employeesList);

        //using contains method:
        boolean hasSpongeBob = employeesList.contains("spongebob");
        System.out.println(hasSpongeBob);

        //to verify multiple elements, you dont need to use contains method multiple times, you can use ContainsAll method instead:
        boolean hasSpongeUnicorn = employeesList.containsAll(Arrays.asList("spongebob", "unicorn"));
        System.out.println(hasSpongeUnicorn);

        System.out.println("----------------removeAll Method:----------------------");
        ArrayList<String> team = new ArrayList<>();
        team.addAll(Arrays.asList("spongebob","unicorn", "tacos", "nacho"));

        team.removeAll(Arrays.asList("spongebob", "nacho"));
        System.out.println(team); //output will be [unicorn, tacos

        System.out.println("----------------retainAll Method:----------------------");
//remove all removes elements that DO match, whereas retain all:
// retainAll decreases size of arraylist by removing all elements that DO NOT Match  (retainAll is oppoite of removeAll)
        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("spongebob","unicorn", "tacos", "nacho"));

        developers.retainAll(Arrays.asList("spongebob", "nacho"));
        System.out.println(developers);



     /*   System.out.println("----------------Converting arraylist to array----------------------"); (following code has error, find error to remove commet brackets and run it.


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "python", "c#"));

        String languages = list2.toArray(new String[0]);
        System.out.println(Arrays.toString(languages));

*/
    }
}
