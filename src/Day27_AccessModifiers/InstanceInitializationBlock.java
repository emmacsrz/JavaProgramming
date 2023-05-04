package Day27_AccessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    //instance initialization block:
    {
        name = "james";
        age=20;

    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        System.out.println(obj1.name);
    }


}
