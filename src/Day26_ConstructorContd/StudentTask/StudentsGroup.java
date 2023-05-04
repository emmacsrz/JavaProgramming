package Day26_ConstructorContd.StudentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {
    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();


    public StudentsGroup(String groupName, int groupId) {//creates the studnetsgroup object, by setting the group name and groupID
        this.groupName = groupName;
        this.groupId = groupId;
    }

    public void addStudent(Student student){
        students.add(student);
    }//takes one student object, adds it to the arraylist of students.
public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
}

    public void addStudent(String name, int age, char gender, String id){
        Student student = new Student (name, age, gender, id);
    }//takes name, age, gender, id of student info, creates student object by using the given info,then adds the student object to the arraylist of students.


    public void removeStudent(String id){
        students.removeIf(p-> p.id.equals(id));
    } //takes the id and then removes the student object with the speicified id from arraylist of students. 




    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", students=" + students.size() + //using .size method because we only need the number of students in the arraylist displayed.
                '}';
    }






}
