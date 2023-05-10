package Day33_AbstractionIntro;

import Day33_AbstractionIntro.EmployeeTask.Employee;

public class Teacher extends Employee {
    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "  is a teacher");
    }


}
