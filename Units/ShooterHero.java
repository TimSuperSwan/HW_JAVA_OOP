package Units;

import java.util.ArrayList;

public abstract class ShooterHero extends BaseHero{
    
    protected Integer bulletCount;
    protected Integer range;
    protected Integer accuracy;
/**
 * 
 * @param bulletCount кол-во пуль
 * @param accuracy меткость
 */

    public ShooterHero(float hp, float maxHp, Integer power, float damage, Integer agility, Integer speed,
            Integer level, Integer bulletCount, Integer accuracy, String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, name,x,y);
        this.bulletCount = bulletCount;
        this.accuracy = accuracy;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends){
        if (this.bulletCount > 0 && this.hp>0) {
            this.attack(this.findClosest(enemies));
            System.out.println("_____УРОН НАНЕСЕН ОТ " + this.getInfo() + " к " + this.findClosest(enemies).getInfo());
            
        }
        
    }

    public Integer getBulletCount() {
        return bulletCount;
    }

    public Integer getRange() {
        return range;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    


    
}
