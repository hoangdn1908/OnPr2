package QuizWeek6.Ques2;

public class Rectangle extends Shape2D{
    protected double length;
    protected double width;

    public Rectangle(Colors colors, boolean filled, Point2D positions, double length, double width)
    {
        super(colors, filled, positions);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "| Length: " + length + "| Width: " + width + "| Area: " + getArea() + "| Perimeter: " + getPerimeter() + ".";
    }
}
