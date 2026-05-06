package QuizWeek6.Ques1;

public class Point2D {
    private double x;
    private double y;

    public Point2D()
    {
        x = 0;
        y = 0;
    }

    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y)
    {
        setX(x);
        setY(y);
    }

    public double getDistanceTo(double x, double y)
    {
         return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public double getDistanceTo(Point2D point)
    {
        return getDistanceTo(point.getX(), point.getY());
    }

    public String toString()
    {
        return "x = " + x + ", y = " + y;
    }
}
