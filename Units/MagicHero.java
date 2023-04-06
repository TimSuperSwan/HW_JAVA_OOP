package Units;

import java.util.ArrayList;

public abstract class MagicHero extends BaseHero {

    protected Integer mana;

    public MagicHero(float hp, float maxHp, Integer power, float damage, Integer agility, Integer speed,
            Integer level, Integer mana, String name, Integer x, Integer y) {
        super(hp, maxHp, power, damage, agility, speed, level, name, x, y);
        this.mana = mana;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends) {
        if (this.mana > 0 && this.hp > 0) {

            for (BaseHero unit : friends) {
                if (unit.hp > 0 && unit.hp < unit.maxHp) {
                    this.attack(unit);
                    if (unit.hp > unit.maxHp) {
                        unit.hp = unit.maxHp;
                    }
                    break;
                }
            }
            this.mana--;
        }
    }

}
