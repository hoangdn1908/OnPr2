package QuizWeek6.Ques2;

public abstract class Shape2D implements Shape2DCalculation{
    protected Colors colors;
    protected boolean filled;
    protected Point2D positions;

    public Shape2D(Colors colors, boolean filled, Point2D positions)
    {
        this.colors = colors;
        this.filled = filled;
        this.positions = positions;
    }

    public Colors getColors() {
        return colors;
    }

    public Point2D getPositions() {
        return positions;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setPositions(Point2D positions) {
        this.positions = positions;
    }

    public String toString()
    {
        return "Color: " + colors + "| Fill: " + filled + "| Position: " + positions;
    }
}
