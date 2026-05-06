package QuizWeek6.Ques1;

public class Vampire extends Monster{

    public Vampire(String name,int health, int attackPower, Point2D positions)
    {
        super(name, health, attackPower, positions);
    }

    @Override
    public void transform() {
        System.out.println(super.getName() + "transforms into a bat!");
    }

    @Override
    public void attack() {
        System.out.println(super.getName() + "(Vampire) attacks by sucking blood!");
    }
}
