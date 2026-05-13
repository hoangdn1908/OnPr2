package Project_Student_Management;

import java.io.Serializable;

public class ITStudent extends Student implements Serializable {
    private double javaScore;
    private double csharpScore;

    public ITStudent(int id, String name, double javaScore, double csharpScore)
    {
        super(id,name);
        this.javaScore =  javaScore;
        this.csharpScore = csharpScore;
        calculateScore();
    }

    @Override
    public void calculateScore() {
          double score = (javaScore + csharpScore) / 2;
          super.setScore(score);
    }
}
