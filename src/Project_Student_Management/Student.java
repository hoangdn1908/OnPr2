package Project_Student_Management;

public abstract class Student {
    private int id;
    private String name;
    private double score;

    public Student(int id, String name)
    {
          setId(id);
          setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if(id < 0)
            throw new IllegalArgumentException("Invalid id");
        this.id = id;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name can not be null or empty");
        if(name.length() > 50)
            throw new IllegalArgumentException("Name can not bee longer than 50");
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public String toString()
    {
        return "ID: " + id  + "| Name: " + name +  "| Score: " + score + ".";
    }

    public abstract void calculateScore();
}
