package Day35_PolymorphismIntro;

import Day34_AbstractionAndInterface.animalTask.*;
import Day35_PolymorphismIntro.transportationTask.CydeoCar;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("sher khan", "bengal", 'F', 5, "large", "orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        // animal.fly();
        animal.eat();
        animal.sleep();
        animal.drink();


        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        ;
        //obj1.eat();
        // obj1.drink();
        // obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);

        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = { parrot, eagle, duck};

        Swimmable[] fishes = {dolphin, shark, duck};

        Playable[] friendlyAnimals = {dog, cat, duck};

        //boolean isAnimal = cydeoCar instanceof Animal; //you will get compiler error IF THERE IS NO relationship between cydeocar and animal.  if you give an object type that has a relationship with animal, you will not get a compiler error.

       boolean isAnimal = dog instanceof Animal;  //output is false
        System.out.println("is dog an instance of animal? " + isAnimal);






    }
}