package QuizWeek6.Ques1;

public class Zombie extends Monster{

    public Zombie(String name, int health, int attackPower, Point2D positions) {
        super(name, health, attackPower, positions);
    }

    @Override
    public void transform() {
        System.out.println(super.getName() + "transforms into Terminal!");
    }

    @Override
    public void attack() {
        System.out.println(super.getName() + "(Zombie) attacks by biting!");
    }
}
