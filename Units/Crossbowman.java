package Units;

public class Crossbowman extends ShooterHero{

    public Crossbowman(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed, Integer level,
            Integer bulletCount, Integer range, Integer accuracy, String name) {
        super(hp, maxHp, power, agility, speed, level, bulletCount, range, accuracy, name);
    }

    public Crossbowman(String name) {
        super(200, maxHp, 10, 2, 4, 1, 5, 4, 2, name);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик";
    }
    


}
