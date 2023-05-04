package Day31_InheritanceContd.animal_methodOverriding;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

//override the eat method:

    @Override
    public void eat() {
        System.out.println("cat " + getName()+" is eating cat food");
    }


}
