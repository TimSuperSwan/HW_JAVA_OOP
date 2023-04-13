package Units;

import java.util.ArrayList;

public class Robber extends BaseHero {

    public Robber(float hp, float maxHp, Integer power, float damage, Integer agility, Integer speed, Integer level,
            String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, name,x,y);
    }

    public Robber(String name, Integer x, Integer y) {
        super(8, 8, 8,3, 3, 6, 1, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }


    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends){
        if (this.agility > 0 && this.hp > 0) {
    
            BaseHero target = null;
            double minDistance = Double.MAX_VALUE;

            for (BaseHero enemy : enemies) {
                if(this.getDistance(enemy)<minDistance && enemy.hp>0){
                    minDistance = this.getDistance(enemy);
                    target = enemy;
                }

            }
            
            if(this.getDistance(target)>=2){
                this.coordinata.direction(target.coordinata, friends);
            }
            else if(target.hp > 0){
                this.attack(target);
                this.agility--;
            }
        }
    }
    
    @Override
    public String getInfo() {
        return "Разбойник"+ " " + this.name + " |Hp - " + this.hp;
    }

    
}
