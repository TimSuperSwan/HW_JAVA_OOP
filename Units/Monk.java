package Units;

public class Monk extends MagicHero {

    public Monk(float hp, float maxHp, Integer power, float damage, Integer agility, Integer speed, Integer level, Integer mana,
            String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, mana, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }

    public Monk(String name, Integer x, Integer y) {
        super(30, 30, 5,-4, 7, 5, 1, 1, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }

    @Override
    public String getInfo() {
        return "Монах"+ " " + this.name + "  " + coordinata.getX() + "," + coordinata.getY();
    }

   

    
    
}
