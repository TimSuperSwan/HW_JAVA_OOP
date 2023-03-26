package Units;

public class Robber extends BaseHero {

    public Robber(float hp, float maxHp, Integer power, float damage, Integer agility, Integer speed, Integer level,
            String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, name,x,y);
    }

    public Robber(String name, Integer x, Integer y) {
        super(10, 10, 8,3, 3, 6, 1, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }

    @Override
    public String getInfo() {
        return "Разбойник"+ " " + this.name + "  " + coordinata.getX() + "," + coordinata.getY();
    }

    
}
