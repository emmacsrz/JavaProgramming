package Day25_DateTimeContd_ConstructorIntro;

import java.time.LocalDate;

public class Employee {
//if you were to use static, it means that that informationw ould be carreid over for every single object.  instance (not using static) allows the inforation to be dynamic and unique to each object that you create.

    public  String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hired_date;

    //the following is the constructor of this class:
    //this constructor will need 6 arguments:


    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hired_date) {//this constructor will allow us to set all the instance variables of the object as soon as the object is created.
        this.name= name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hired_date = hired_date;
    }

    public String toString() {//this allows us to pass the instances when they are passed in a print statement.
        return "Employee{" +
                "name =" + name +
                "age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hired_date=" + hired_date +
                '}';
    }





}
