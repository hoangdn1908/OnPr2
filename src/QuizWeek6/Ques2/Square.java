package QuizWeek6.Ques2;

import java.io.Reader;

public class Square extends Rectangle {

    public Square(Colors colors, boolean filled, Point2D positions, double side) {
        super(colors, filled, positions, side, side);
    }

    public double getSide()
    {
        return super.getLength();
    }

    public void setSide(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public double getPerimeter() {
        return super.length * 4;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
