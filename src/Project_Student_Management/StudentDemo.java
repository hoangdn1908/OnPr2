package Project_Student_Management;

public class StudentDemo {
    public static void main(String[] args) {
        ITStudent itStudent = new ITStudent(1,"Hoang",8,9);
        ITStudent itStudent1 = new ITStudent(3,"Hung",8,9);
        StudentManager<ITStudent> itStudentStudentManager = new StudentManager<>();
        itStudentStudentManager.add(itStudent);
        itStudentStudentManager.add(itStudent1);
        String fileName = "src/Project_Student_Management/data.dat";
        itStudentStudentManager.save(fileName);
        StudentManager<ITStudent> itStudentStudentManager1 = new StudentManager<>();
        itStudentStudentManager1.load(fileName);
        itStudentStudentManager1.displayAll();
    }
}
