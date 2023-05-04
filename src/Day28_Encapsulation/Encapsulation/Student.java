package Day28_Encapsulation.Encapsulation;

public class Student {
    private String name;
    private int age; //private variable

    public String getName(){
        if (name == null){
            System.out.println("name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(){
        boolean hasDigit = false;
        for (char each : name.toCharArray()){
            if (Character.isDigit(each)){
                hasDigit =true;
            }
        }
    }

    public int getAge() { //getter method with matching variable type, and returns age value
        if (age == 0) {
            System.err.println("age has not been set");
            System.exit(1); //terminates the program if exit code is 1 - which means something was wrong in the code)
        }
        return age;
    }

    //setter for setting the age:
    //uses if statements as conditions to dictate how the proram responds to different inputs, such as inputting an invalid age
    public void setAge(int age) {
        if (age < 1 || age > 100) {
            System.err.println("invalid age: " + age);
            System.exit(1); //terminates the program whenever the above ondition is true (if age is invalid)
        }
        this.age = age;
    }
    //outside this class, the only way to read the private data of the age variable, is through its getter.


}
