package Day31_InheritanceContd.animal_methodOverriding;

import org.w3c.dom.ls.LSOutput;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("lion " + getName()+ " is eating deer ");

    }

    public void roar(){
        System.out.println("lion, " +getName()+ " is roaring");
    }

    @Override
    public String toString() {

        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", breed='" +getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", African lion='" + isAfricanLion + '\'' +
                '}';
             /* you can also write this toString method like this:

            return super.toString().replace("}", "")+
                ", African lion='" + isAfricanLion + '\'' +
                '}';
         */
    }
}
