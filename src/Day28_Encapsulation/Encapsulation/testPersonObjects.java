package Day28_Encapsulation.Encapsulation;

import java.time.LocalDate;

public class testPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Spongebob", 22, 'M', LocalDate.of(2000, 4, 1));

        System.out.println(person1);

    }
}
