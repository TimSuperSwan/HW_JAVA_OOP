package Units;
import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements Actions{
    public float hp;
    protected String name;
    protected float maxHp;
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
        //Coordinates coordinata = new Coordinates(x, y);
    }

    public double getDistance(BaseHero enemy) {
        return Math.sqrt(Math.pow(enemy.coordinata.getX()-this.coordinata.getX(), 2)+ Math.pow(enemy.coordinata.getY()-this.coordinata.getY(), 2));
    }

    @Override
    public void attack (BaseHero enemy){
        if (enemy.hp >= this.getDamage()) {
            enemy.hp -= this.getDamage();
        } 
        else{
            enemy.hp = 0;
        }
    }

    public BaseHero findClosest(ArrayList<BaseHero> enemies){
        double minDist = this.getDistance(enemies.get(9));
        BaseHero closestEnemy = enemies.get(9);
        for (BaseHero enemy : enemies) {
            if ((this.getDistance(enemy) < minDist) && enemy.isAlive()) {
                minDist = this.getDistance(enemy);
                closestEnemy = enemy;
            }
        }
        
       
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
        //заглушка
        
    }

    
    

    public static String generateName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    @Override
    public String toString() {
        return "BaseHero [hp=" + hp + ", name=" + name + ", power=" + power + ", agility=" + agility + ", speed="
                + speed + ", level=" + level + ", x=" + coordinata.getX() + ", y=" + coordinata.getY() +"]";
    }

    
    @Override
    public String getInfo() {
        return " ";
    }

    // public float getHp() {
    //     return hp;
    // }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinata;
    }

    public Integer getPower() {
        return power;
    }

    // public Integer getAgility() {
    //     return agility;
    // }

    public Integer getSpeed() {
        return speed;
    }

    public float getDamage() {
        return damage;
    }

   

}
