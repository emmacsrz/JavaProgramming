package Day29_Inheritance.animalTask;

public class Dog extends Animal { // dog = subclass, Animal = super class (Dog inheerits parents methods and variables)


    public void bark() {
        System.out.println(getName() + " is barking ");
    }

    public static void main(String[] args) {
        Dog dog1= new Dog();


    }




/*
all of the following is contained in dog class when you extend the animal clasS:
    public void method() {
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString();

    }

    */


}