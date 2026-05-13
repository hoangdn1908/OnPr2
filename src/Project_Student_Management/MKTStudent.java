package Project_Student_Management;

import java.io.Serializable;

public class MKTStudent extends Student implements Serializable {
    private double marketingScore;
    private double salesScore;

    public MKTStudent(int id, String name, double marketingScore, double salesScore)
    {
        super(id, name);
        this.marketingScore = marketingScore;
        this.salesScore = salesScore;
        calculateScore();
    }

    @Override
    public void calculateScore() {
        double score = (marketingScore + salesScore) / 2;
        super.setScore(score);
    }
}
