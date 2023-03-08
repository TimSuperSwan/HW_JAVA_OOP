package Units;

public class Monk extends MagicHero {

    public Monk(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed, Integer level, Integer mana,
            String name) {
        super(hp, maxHp, power, agility, speed, level, mana, name);
    }

    public Monk(String name) {
        super(200, maxHp, 5, 1, 3, 1, 25, name);
    }

    @Override
    public String getInfo() {
        return "Монах";
    }

    @Override
    public String toString() {
        return "Monk [hp=" + hp + ", name=" + name + ", power=" + power + ", agility=" + agility + ", speed="
        + speed + ", level=" + level + ", mana=" + mana + "]";
    }

    
}
