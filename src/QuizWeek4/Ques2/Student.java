package QuizWeek4.Ques2;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee)
    {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[Person[name=" + super.name + ",address=" + super.address + "], program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}
