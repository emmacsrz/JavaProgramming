package Day31_InheritanceContd.animal_methodOverriding;

public class Dog extends Animal {
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("dog "+ getName() + " is eating dog food");
    }

    public void bark(){
        System.out.println("dog "+ getName() + " is barking");
    }



}
