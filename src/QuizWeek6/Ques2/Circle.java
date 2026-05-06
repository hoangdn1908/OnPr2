package QuizWeek6.Ques2;

public class Circle extends Shape2D{
    private double radius;

    public Circle(Colors colors, boolean filled, Point2D positions, double radius)
    {
        super(colors, filled, positions);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "| Radius: " + radius + "| Area: " + getArea() + "| Perimeter: " + getPerimeter() + ".";
    }
}
