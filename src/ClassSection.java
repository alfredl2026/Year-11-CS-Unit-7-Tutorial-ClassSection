import java.lang.reflect.Array;
import java.util.ArrayList;
public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students = new ArrayList();
    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getYearLevel(){
        return this.yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public void addStudent(Student student){
        if(student.getYearLevel() == this.yearLevel && !isStudentEnrolled(student)) {
            this.students.add(student);
        }
    }
    public void removeStudent(Student student){
        int i = 0;
        for(Student s : students){
            if(s.equals(students.get(i))){
                students.remove(i);
                break;
            }
            i++;
        }
    }
    public boolean isStudentEnrolled(Student student){
        for(Student s : students){
            if(student.equals(s)){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return("ClassSection{subject='" + subject + "', capacity=" + capacity + ", yearLevel=" + yearLevel + ", students=" + students + "}");
    }

}
