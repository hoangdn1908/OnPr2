package QuizWeek6.Ques2;

import java.util.concurrent.RecursiveAction;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(Colors.RED, true, new Point2D(2,3), 3);
        Rectangle rectangle  = new Rectangle(Colors.WHITE, true, new Point2D(1,1), 5,4);
        Circle circle  = new Circle(Colors.BLACK, false, new Point2D(2,2), 4);
        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(circle);
    }
}
