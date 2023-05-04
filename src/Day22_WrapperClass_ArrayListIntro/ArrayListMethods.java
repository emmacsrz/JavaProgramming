package Day22_WrapperClass_ArrayListIntro;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);  //add method internally converts primitive int 10 into wrapper class 10, (autoboxing)
        list.add(20);
        list.add(30);
        System.out.println(list); //output is [10,20,30]
//how to insert a number at a specific index:

        list.add(1, 15); //shifts current index one to the right, and inserts 15 at index 1 in the arraylist
        System.out.println("----------------------------------------------");


        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("mohammad");
        studentsList.add("emma");
        studentsList.add("unicorns");
        studentsList.add("spongebob");

        System.out.println(studentsList.size()); //gives you size of arraylist
        System.out.println(studentsList.get(0)); //returns the element at the index of the specified number in the ()

        String firstStudent = studentsList.get(0); //assigns the first student's name to a variable
        System.out.println(firstStudent);

        String lastStudent = studentsList.get(studentsList.size()-1); //returns last index number and assigns the element's value to the lastStudent variable. ".size()" is basically the same as .length in string.  It is just called .size for arraymethods.
        System.out.println(lastStudent);





    }
}
