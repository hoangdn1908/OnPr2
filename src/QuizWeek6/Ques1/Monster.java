package QuizWeek6.Ques1;

public abstract class Monster implements Movable, SpecialAbility{
    private String name;
    private int health;
    private int attackPower;
    private Point2D position;

    public Monster(String name, int health, int attackPower, Point2D position)
    {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth()
    {
        if(health <= 0) return;
        this.health -= 1;
    }

    public int getAttackPower()
    {
        return attackPower;
    }

    public void raiseAttackPower()
    {
        attackPower += 1;
    }

    public Point2D getPosition()
    {
        return position;
    }

    @Override
    public void moveUp() {
        position.setX(position.getX() + 1);
    }

    @Override
    public void moveDown() {
        position.setX(position.getX() - 1);
    }

    @Override
    public void moveLeft() {
        position.setX(position.getY() - 1);
    }

    @Override
    public void moveRight() {
        position.setX(position.getY() + 1);
    }

    @Override
    public abstract void transform();

    public abstract void attack();

    @Override
    public void teleport(Point2D point2D) {
         this.position.setXY(point2D.getX(), point2D.getY());
    }
}
