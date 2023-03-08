package Units;

public class Peasant extends BaseHero{

    
    public Peasant(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed, Integer level,
            String name) {
        super(hp, maxHp, power, agility, speed, level, name);
    }

    public Peasant(String name) {super(100, 100, 1, 1, 1, 1, name);}

    @Override
    public String getInfo() {
        return "Крестьянин";
    }
    
}
