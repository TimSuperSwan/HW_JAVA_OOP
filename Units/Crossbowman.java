package Units;

public class Crossbowman extends ShooterHero{

    

    public Crossbowman(float hp, float maxHp, Integer power, float damage, Integer agility, Integer speed,
            Integer level, Integer bulletCount, Integer accuracy, String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, bulletCount, accuracy, name,x,y);
    }

    public Crossbowman(String name, Integer x, Integer y) {
        super(10, 10, 6, 6, 3, 4, 1, 16, 2, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик"+ " " + this.name + "  " + coordinata.getX() + "," + coordinata.getY();
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
