package Day27_AccessModifiers;

import day07_MultiBranchIf_NestedIf.Cydeo;

public class TestCydeoStudent {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("ekaterina", 29, 'f');
        CydeoStudent student2 = new CydeoStudent("alena", 28, 'f');

        System.out.println(student1);
        System.out.println("student2 = " + student2);

        System.out.println(student1.schoolname);
        System.out.println(student2.schoolname);


        System.out.println(student1.secretCode );
        System.out.println(student2.secretCode);



    }
}
