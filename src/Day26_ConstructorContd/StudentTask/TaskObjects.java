package Day26_ConstructorContd.StudentTask;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");


        Student[] students = {student1, student2, student3, student4, student5};

        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);


        group1.addStudent(students);

        group1.addStudent("Spongebob", 25, 'm', "SB1");

//this class needs work, group 3 is correct, continue using that approach for the remaining groups

        StudentsGroup group2 = new StudentsGroup("Java Penguins", 2);
        Student unicorn = new Student("unicorn", 30, 'f', "uni1");
        Student squid = new Student("squidward", 30, 'm', "squi1");

        group2.addStudent(unicorn);
        group2.addStudent(squid);


        StudentsGroup group3 = new StudentsGroup("Java Polar Bears", 3);
        Student sandy = new Student("sandy", 22, 'f', "sand1");
        Student barnicle = new Student("barnicleBoy", 50, 'm', "BB1");

        group3.addStudent(sandy);
        group3.addStudent(barnicle);


        StudentsGroup group4 = new StudentsGroup("Java Chickens", 4);
        Student crabs = new Student("MrCrabs", 40, 'm', "Crab1");
        group4.addStudent(crabs);

        StudentsGroup[] groups = {group1, group2, group3, group4};

        for (StudentsGroup each : groups) { //outer loop, will iterate each individual array

            System.out.println(each);

           /* for (Student eachStudent : each){//inner loop, will iterate over the indexes of the inner 1D arrays to return each element within them.
                System.out.println(eachStudent);

            }
        }

        for (StudentsGroup each : groups) {
            System.out.println(each);
        }
*/
        }
    }
}
