package Units;

public class Archer extends ShooterHero {

    public Archer(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed, Integer level,
            Integer bulletCount, Integer range, Integer accuracy, String name) {
        super(hp, maxHp, power, agility, speed, level, bulletCount, range, accuracy, name);
    }

    public Archer( String name) {
        super(200, maxHp, 7, 3, 5, 1, 10, 2, 1, name);
    }

    
    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "Лучник"+ " " + this.name;
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
