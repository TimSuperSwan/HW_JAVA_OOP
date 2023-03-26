package Units;

public class Peasant extends BaseHero{

    
    public Peasant(float hp, float maxHp, Integer power, Integer damage,Integer agility, Integer speed, Integer level,
            String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, name,x,y);
    }

    public Peasant(String name, Integer x, Integer y) {
        super(1, 1, 1,1, 1, 3, 1, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    
    }

    @Override
    public String getInfo() {
        return "Крестьянин"+ " " + this.name + "  " + coordinata.getX() + "," + coordinata.getY();
    }
    
    
}
