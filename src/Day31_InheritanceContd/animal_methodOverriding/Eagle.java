package Day31_InheritanceContd.animal_methodOverriding;

public class Eagle extends Animal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("eagle, "+ getName() +  ", is eating snake");
    }
}
