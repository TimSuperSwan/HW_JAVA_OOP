package Units;
import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements Actions{
    protected float hp;
    protected String name;
    protected static float maxHp;
    protected Integer power;
    protected Integer agility;
    protected Integer speed;
    protected Integer level;
    protected float damage;
    public Coordinates coordinata = new Coordinates(0, 0);
    

    /**
     * 
     * @param coordinata координата персонажа
     * @param hp текущие очки жизни
     * @param name имя
     * @param maxHp максимальный уровень жизни
     * @param power сила
     * @param agility ловкость
     * @param speed скорость
     * @param level уровень персонажа
     */
    
    public BaseHero(float hp, float maxHp, Integer power, float damage, Integer agility, Integer speed,
            Integer level, String name, Integer x, Integer y) {

        this.hp = hp;
        this.name = name;
        maxHp = this.hp;
        this.power = power;
        this.damage = damage;
        this.agility = agility;
        this.speed = speed;
        this.level = level;
    }

    public double getDistance(BaseHero enemy) {
        return Math.sqrt(Math.pow(enemy.coordinata.getX()-this.coordinata.getX(), 2)+ Math.pow(enemy.coordinata.getY()-this.coordinata.getY(), 2));
    }

    @Override
    public void attack (BaseHero enemy){
        enemy.hp -= this.getDamage();
    }

    public BaseHero findClosest(ArrayList<BaseHero> enemies){
        double minDist = this.getDistance(enemies.get(9));
        BaseHero closestEnemy = enemies.get(9);
        for (BaseHero enemy : enemies) {
            if ((this.getDistance(enemy) < minDist)) {
                minDist = this.getDistance(enemy);
                closestEnemy = enemy;
                System.out.println("Нашел ближайшего, расстояние от" + enemy.getInfo() + " до "+ this.getInfo() + "  " + this.getDistance(enemy));


            }
        }
        
        // System.out.println("Ближайший враг:____" + closestEnemy.getInfo());
        // System.out.println(this.getDistance(closestEnemy) + "  от " + this.getInfo() + " до " + closestEnemy.getInfo());
        return closestEnemy;
    }

    public boolean isAlive (){
        if (this.hp > 0) { 
            return true;
        }
        else { return false;}
    }

    
    
    
    @Override
    public void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends) {
        System.out.println("шаг заглушка");
        
    }

    
    

    public static String generateName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    @Override
    public String toString() {
        return "BaseHero [hp=" + hp + ", name=" + name + ", power=" + power + ", agility=" + agility + ", speed="
                + speed + ", level=" + level + ", x=" + coordinata.getX() + ", y=" + coordinata.getY() +"]";
    }

    

    public float getHp() {
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


    public static float getMaxHp() {
        return maxHp;
    }

    public float getDamage() {
        return damage;
    }

   

}
