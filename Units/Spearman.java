package Units;

import java.util.ArrayList;

public class Spearman extends BaseHero{

    public Spearman(float hp, float maxHp, Integer power, float damage,Integer agility, Integer speed, Integer level,
            String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, name, x, y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }

    public Spearman(String name, Integer x, Integer y) {
        super(11, 111, 4,3, 5, 4, 1, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }
    
    @Override
    public String getInfo() {
        return "Копейщик"+ " " + this.name + " |Hp - " + this.hp;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends){
        if (this.agility > 0 && this.hp > 0) {
    
            BaseHero target = null;
            double minDistance = Double.MAX_VALUE;

            for (BaseHero unit : team) {
                if(this.getDistance(unit)<minDistance && unit.hp>0){
                    minDistance = this.getDistance(unit);
                    target = unit;
                }

            }
            // System.out.printf("%s выбрал %s\n", this.getClass().getSimpleName(), target.getClass().getSimpleName());
            if(this.getDistance(target)>=2){
                this.coordinata.direction(target.coordinata, friends);
            }
            else if(target.hp > 0){
                this.attack(target);
                this.agility--;
            }
        }
    }  
}
