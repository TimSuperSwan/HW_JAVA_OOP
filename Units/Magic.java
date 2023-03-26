package Units;

public class Magic extends MagicHero {

    public Magic(float hp, float maxHp, Integer power, float damage, Integer agility, Integer speed, Integer level, Integer mana,
            String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, mana, name, x, y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }

    public Magic(String name, Integer x, Integer y) {
        super(30, 30, 17,-5, 12, 9, 1,1, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
        
    }

    @Override
    public String getInfo() {
        return "Маг"+ " " + this.name + "  " + coordinata.getX() + "," + coordinata.getY();
    }

    
}
