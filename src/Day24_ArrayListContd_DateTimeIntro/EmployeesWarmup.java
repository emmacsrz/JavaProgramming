package Day24_ArrayListContd_DateTimeIntro;

import Day17_CustomClassIntro.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeesWarmup {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));
//using employee custom class to add information to each index of the arraylist:
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");
//accessing the information:

        for (Employee each : employees) {  //employees is the custom class, you use this instead of String or int etc.
            System.out.println(each.name + " : " + each.jobTitle); //name and job title are attributes of the object
        }


        System.out.println();
        System.out.println("java developers: ");
        for (Employee each : employees) {
            if (each.jobTitle.equals("Java Developer")) {//if job title of employee is java developer
                System.out.println(each.name); //displays only the names of employees whos job description matches if statement
            }
        }

        System.out.println();
        System.out.println();

        double max = employees.get(0).salary; //  this assumes first employee has highest salary, then you will compare every other salary later to see if it smore or less and it will replace this employee with the one ewith higher salary.   double isneeded because salar is double

        for (Employee each: employees){
            if (each.salary>max){
                max = each.salary;
            }
        }
        System.out.println("max = " + max);



double min = employees.get(0).salary; //to find min salary
        for (Employee each: employees){
            if (each.salary<min){
                min = each.salary;
            }
        }
        System.out.println("min = "+min);

        //create 2  array lists with only female and male employees
        ArrayList<Employee> femaleEmployees= new ArrayList<>();
        ArrayList<Employee> maleEmployees= new ArrayList<>();

for (Employee employee: employees) {
    if (employee.gender == 'M') {
        maleEmployees.add(employee);
    } else {
femaleEmployees.add(employee);
    }
}
        System.out.println("female employees:" +  femaleEmployees.size()); //returns how many female employees there are
        System.out.println("male employees:" +  maleEmployees.size());




        /*
        1. Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a progam that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists

         */
    }
}

