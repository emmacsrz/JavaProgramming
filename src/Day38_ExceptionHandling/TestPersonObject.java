package Day38_ExceptionHandling;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("daniel", 32, 'm');
        System.out.println(person1);

        person1.setAge(-25);

        System.out.println(person1);


    }
}
