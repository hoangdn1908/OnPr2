package QuizWeek4.Ques2;

public class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay)
    {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[Person[name=" + super.name + ",address=" + super.address + "], school=" + school + ", pay=" + pay + "]";
    }
}
