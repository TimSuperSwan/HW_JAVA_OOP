package Units;

public abstract class ShooterHero extends BaseHero{
    
    protected Integer bulletCount;
    protected Integer range;
    protected Integer accuracy;
/**
 * 
 * @param bulletCount кол-во пуль
 * @param range дальность выстрела
 * @param accuracy меткость
 */

    public ShooterHero(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed,
            Integer level, Integer bulletCount, Integer range, Integer accuracy, String name) {
        super(hp, maxHp, power, agility, speed, level, name);
        this.bulletCount = bulletCount;
        this.range = range;
        this.accuracy = accuracy;
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
