package Day29_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("max", "husky", 'M', 4, "large", "white");
        System.out.println("---------------");
        System.out.println();
        Cat cat = new Cat();
        cat.setInfo("felicia", "stray", 'F', 3, "medium", "black and white");
        System.out.println("---------------");
        System.out.println();
        Tiger tiger = new Tiger();
        tiger.setInfo("Shere Khan", "bengal", 'M', 5, "large", "orange");

        System.out.println("---------------");
        System.out.println();

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);
        System.out.println("---------------");
        System.out.println();

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.bark();
        System.out.println("---------------");


        cat.eat();
        cat.drink();
        cat.sleep();
        cat.meow();
        System.out.println("---------------");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();


        System.out.println("---------------");

        System.out.println(dog.getName());
        System.out.println(dog.getColor());


    }

}