package Units;

public class Magic extends MagicHero {

    public Magic(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed, Integer level, Integer mana,
            String name) {
        super(hp, maxHp, power, agility, speed, level, mana, name);
    }

    public Magic(String name) {
        super(200, Magic.maxHp, 20, 2, 2, 1,10, name);
        
    }

    @Override
    public String getInfo() {
        return "Маг"+ " " + this.name;
    }

    
}
