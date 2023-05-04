package Day24_ArrayListContd_DateTimeIntro;
import Day17_CustomClassIntro.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class TestPersonObjects {    public static void main(String[] args) {

    Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
    people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
    people[1].setInfo("Spongebob", 'M', LocalDate.of(1990, 1, 20));
    people[2].setInfo("Patrick", 'M', LocalDate.of(1991, 6, 10));
    people[3].setInfo("Squidward", 'M', LocalDate.of(1960, 11, 30));
    people[4].setInfo("MrCrabs", 'M', LocalDate.of(1965, 4, 9));



    ArrayList<Person> studentsList = new ArrayList<>();
    studentsList.addAll( Arrays.asList(people) );
    System.out.println(studentsList);

    for (Person each : studentsList) {
        System.out.println(each.name + " : " + each.dateOfBirth);

    }


    studentsList.removeIf(person -> person.age>=55);
    System.out.println(studentsList);




    // print name & date of birth of each person object


    // remove all the person object that has the age > 55


}

}