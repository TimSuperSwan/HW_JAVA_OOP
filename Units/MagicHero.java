package Units;

import java.util.ArrayList;

public abstract class MagicHero extends BaseHero {

    protected Integer mana;

    public MagicHero(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed,
            Integer level, Integer mana, String name) {
        super(hp, maxHp, power, agility, speed, level, name);
        this.mana = mana;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies){
        System.out.println("лечу");
    }

}
