package day06_ifStatements;

public class gradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 18;
        boolean elementarySchool = gradeLevel >= 1 && gradeLevel <= 5;
        boolean middleSchool = gradeLevel >= 6 && gradeLevel <= 8;
        boolean highSchool = gradeLevel>=9 && gradeLevel <=12;
        boolean college = gradeLevel >=13 && gradeLevel <=16;
        boolean gradSchool = gradeLevel >=18 && gradeLevel <=18;

        if(elementarySchool) {
            System.out.println("Elementary school: " + elementarySchool);
        }
        if(middleSchool) {
            System.out.println("middle school: " + middleSchool);
        }
        if(highSchool) {
            System.out.println("high school: " + highSchool);
        }
        if(college) {
            System.out.println("college: " + college);
        }
        if(gradSchool) {
            System.out.println("grad school: " + gradSchool);
        }
    }
}
