package Day29_Inheritance.encapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Hamza", 26, 'M', 'A', "MIT");

        System.out.println(student1);

        student1.setAge(29);
        student1.setGrade('C');
        student1.setSchoolName("Cydeo");
        System.out.println(student1);


    }


}