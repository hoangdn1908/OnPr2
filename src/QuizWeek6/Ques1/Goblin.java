package QuizWeek6.Ques1;

public class Goblin extends Monster{

    public Goblin(String name,int health, int attackPower, Point2D positions)
    {
        super(name, health, attackPower, positions);
    }

    @Override
    public void transform() {
        System.out.println(super.getName() + "transforms into Hulk!");
    }

    @Override
    public void attack() {
        System.out.println(super.getName() + "(Goblin) attacks with a club!");
    }
}
