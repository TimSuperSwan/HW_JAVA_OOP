package Units;
import java.lang.Math;
import java.util.ArrayList;
public class Coordinates {
    public int x;
    public int y;
    public String heroName;
    public double distance;


    
    
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    

    @Override
    public String toString() {
        return "Coordinates [x=" + x + ", y=" + y + ", heroName=" + heroName + "]";
    }
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String getHeroName() {
        return heroName;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }



    

    

}
