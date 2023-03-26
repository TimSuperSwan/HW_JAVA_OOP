package Units;
public class Spearman extends BaseHero{

    public Spearman(float hp, float maxHp, Integer power, float damage,Integer agility, Integer speed, Integer level,
            String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, name, x, y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }

    public Spearman(String name, Integer x, Integer y) {
        super(10, 10, 4,3, 5, 4, 1, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }
    
    @Override
    public String getInfo() {
        return "Копейщик"+ " " + this.name + "  " + coordinata.getX() + "," + coordinata.getY();
    }

    
}
