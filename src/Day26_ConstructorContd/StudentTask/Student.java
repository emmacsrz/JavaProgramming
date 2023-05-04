package Day26_ConstructorContd.StudentTask;

public class Student {
    //attributes:
        public String name;
        public int age;
        public char gender;
        public String id;

//constructor:
    public Student(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }


    public void study(){
        System.out.println(this.name + " is studying");

    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }
}
