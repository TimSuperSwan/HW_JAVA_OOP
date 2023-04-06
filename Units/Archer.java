package Units;

public class Archer extends ShooterHero {

    // public Coordinates coordinata = new Coordinates(0, 0);
    // protected Integer x; 
    // protected Integer y; 

    public Archer(float hp, float maxHp, Integer power, float damage, Integer agility, Integer speed, Integer level,
            Integer bulletCount, Integer accuracy, String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, bulletCount, accuracy, name,x,y);

        }

    public Archer( String name, Integer x, Integer y) {
        super(15, 15, 12,1, 10, 9, 1, 32, 1, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }

    
    
    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "Лучник"+ " " + this.name + "  " + this.coordinata.getX() + "," + this.coordinata.getY();
    }

    public Integer getBulletCount() {
        return this.bulletCount;
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

    public Coordinates getCoordinata() {
        return coordinata;
    }

    
    

        
    
    
}
