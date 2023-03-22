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
        return "Арбалетчик"+ " " + this.name;
    }
    
    public Integer getBulletCount() {
        return bulletCount;
    }
    public void setBulletCount(Integer bulletCount) {
        this.bulletCount = bulletCount;
    }
    public Integer getRange() {
        return range;
    }
    public void setRange(Integer range) {
        this.range = range;
    }
    public Integer getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

}
