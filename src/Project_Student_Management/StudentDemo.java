package Project_Student_Management;

public class StudentDemo {
    public static void main(String[] args) {
        ITStudent itStudent = new ITStudent(1,"Hoang",8,9);
        ITStudent itStudent1 = new ITStudent(3,"Hung",8,9);
        StudentManager<ITStudent> itStudentStudentManager = new StudentManager<>();
        itStudentStudentManager.add(itStudent1);
        itStudentStudentManager.add(itStudent);
        itStudentStudentManager.remove(4);
        itStudentStudentManager.displayAll();
    }
}
