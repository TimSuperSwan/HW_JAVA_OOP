package Units;

public class Robber extends BaseHero {

    public Robber(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed, Integer level,
            String name) {
        super(hp, maxHp, power, agility, speed, level, name);
    }

    public Robber(String name) {
        super(200, maxHp, 20, 7, 5, 1, name);
    }

    @Override
    public String getInfo() {
        return "Разбойник"+ " " + this.name;
    }

    
}
