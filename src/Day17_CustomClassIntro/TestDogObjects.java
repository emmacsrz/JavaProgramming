package Day17_CustomClassIntro;

public class TestDogObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.name = "max";
        dog1.breed = "husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "large";
        dog1.color = "black";

        Dog dog2 = new Dog();
        dog2.name = "Chancho";
        dog2.breed = "australian shepherd";
        dog2.gender = 'm';
        dog2.age = 1;
        dog2.size = "medium";
        dog2.color = "black tri";

        Dog dog3 = new Dog();
        dog3.setInfo("loki", "chow", 'm', 3, "black", "M");

        Dog dog4 = new Dog();
        dog4.setInfo("fido","german shepherd", 'm', 3, "black", "M");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
    }
}
