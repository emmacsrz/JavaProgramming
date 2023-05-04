package Day28_Encapsulation.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Mohammad");
        Person person2 = new Person("Abidulluh", 'M');
        Person person3 = new Person("Hasan", 30);
        Person person4 = new Person("Daniel", "English");
        Person person5 = new Person("Tatiana", 25, 'F');
        Person person6 = new Person("Lucy", 31, 'F', "English");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        person1.name = "james";

        System.out.println(person1);

        Person.printPlanetName();

        person1.eat("Baklava");
        System.out.println(person1);

    }

}