package day03_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String EmployeeName = "Javier";
        int age = 10;
        char gender = 'M';
        String CompanyName = "stay at home son",
                jobTitle = "unemployed musician";
        //you can use comma instead of semi colon if you are declaring mutliples of the same type of variable.
        double salary = 1.50;
        boolean isFullTime = true;

        System.out.println(EmployeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(CompanyName);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);
        System.out.println();
        System.err.println("isFullTime = " + isFullTime);
//last one above is from using "soutv + enter" shortcut, then select variable


    }


    /*1. CreateaclassnamedEmployeeInfo.java
2. Declarethefollowingvariableswithappropriatedatatypes:
1. name
2. age
3. gender
4. companyName 5. employeeId
6. jobTitle
7. salary
8. isFullTime */
}
