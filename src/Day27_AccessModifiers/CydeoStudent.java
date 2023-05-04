package Day27_AccessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolname; //initialized later in static block

    public static String secretCode;



    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static{
        schoolname="cydeo";
        secretCode="wooden spoon";
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
