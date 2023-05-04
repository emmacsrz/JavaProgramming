package Day17_CustomClassIntro;

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("emma", 29,'f', "car sales",100000,"babalabla");

        System.out.println(employee1);

        System.out.println(employee1.age);

        System.out.println("my salary is " + employee1.salary);
    }
}
