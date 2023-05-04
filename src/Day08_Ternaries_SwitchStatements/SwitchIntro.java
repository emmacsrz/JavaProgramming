package Day08_Ternaries_SwitchStatements;

public class SwitchIntro {
    public static void main(String[] args) {

//switch statement is faster than if statement. Switched statement is used for finding exact matching data.
        //you are expected to give case values in switch statement
        //case (case keyword) and  case value . every single case must have value. Case value must be same data type as one provided in expression.  For example, grade variable is char value, that means case value also has to be char.
        char grade = 'd';
        String result = " ";

        switch (grade) {
            case 'a': //if case A matches expression, then we print:
                System.out.println("excelent");
                break; //break statement closes the case.
            case 'b':  //case blocks cannot be duplicated
                System.out.println("great job");
                break;
            case 'c':  //case blocks cannot be duplicated
                System.out.println("good");
                break;
            case 'd':  //case blocks cannot be duplicated
                System.out.println("passed");
                break;
            case 'f':  //case blocks cannot be duplicated
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid"); //only runs when none of case blocks are matching
        }




    }
}
