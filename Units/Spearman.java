package Units;
public class Spearman extends BaseHero{

    public Spearman(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed, Integer level,
            String name) {
        super(hp, maxHp, power, agility, speed, level, name);
    }

    public Spearman(String name) {
        super(200, maxHp, 30, 5, 4, 1, name);
    }
    
    @Override
    public String getInfo() {
        return "Копейщик"+ " " + this.name;
    }

    
}
