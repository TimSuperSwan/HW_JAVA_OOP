package Units;
import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements Actions{
    protected Integer hp;
    protected String name;
    protected static Integer maxHp;
    protected Integer power;
    protected Integer agility;
    protected Integer speed;
    protected Integer level;

    /**
     * 
     * @param hp текущие очки жизни
     * @param name имя
     * @param maxHp максимальный уровень жизни
     * @param power сила
     * @param agility ловкость
     * @param speed скорость
     * @param level уровень персонажа
     */
    
    public BaseHero(Integer hp, Integer maxHp, Integer power, Integer agility, Integer speed,
            Integer level, String name) {
        this.hp = hp;
        this.name = name;
        maxHp = this.hp;
        this.power = power;
        this.agility = agility;
        this.speed = speed;
        this.level = level;
    }

    
    @Override
    public void step(ArrayList<BaseHero> enemies) {
        System.out.println("шаг заглушка");
        
    }

    

    public static String generateName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    @Override
    public String toString() {
        return "BaseHero [hp=" + hp + ", name=" + name + ", power=" + power + ", agility=" + agility + ", speed="
                + speed + ", level=" + level + "]";
    }

    


    public Integer getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    

    public Integer getPower() {
        return power;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getLevel() {
        return level;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


    public static Integer getMaxHp() {
        return maxHp;
    }

}
