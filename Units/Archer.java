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
        super(9, 9, 5,6, 10, 4, 1, 32, 1, name,x,y);
        this.coordinata.setX(x);
        this.coordinata.setY(y);
    }

    
    
    @Override
    public String getInfo() {
       return "Лучник"+ " " + this.name + " |Hp - " + this.hp;
    }

    
    public Coordinates getCoordinata() {
        return coordinata;
    }

    
    

        
    
    
}
