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

    @Override
    public void step(){
        
    }



    
}
