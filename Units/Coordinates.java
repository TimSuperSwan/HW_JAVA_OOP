package Units;

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

    public boolean isEquals(Coordinates coordinates) {
        if ((coordinates.x == this.x) & (coordinates.y == this.y))
            return true;
        else
            return false;
    }
    
    public void direction(Coordinates coordinates, ArrayList<BaseHero> friends) {
        boolean[] temp = checkPos(friends);
        float dx = Math.abs(this.x - coordinates.x);
        float dy = Math.abs(this.y - coordinates.y);
        if ((dx > dy)) {
            if (this.x < coordinates.x && !temp[0] && this.x + 1 != 11) {
                this.x += 1;
                System.out.printf("1 %s\n", this.getClass().getSimpleName());
                return;
            } else if (this.x > coordinates.x && !temp[1] && this.x - 1 != 0) {
                this.x -= 1;
                System.out.printf("2 %s\n", this.getClass().getSimpleName());
                return;
            }
            if (this.y <= coordinates.y && !temp[2]&& this.y + 1 != 11) {
                this.y += 1;
                System.out.printf("3 %s\n", this.getClass().getSimpleName());
                return;
            } else if (this.y >= coordinates.y && !temp[3]&& this.y - 1 != 0) {
                this.y -= 1;
                System.out.printf("4 %n", this.getClass().getSimpleName());
                return;
            }
        } else {
            if (this.y < coordinates.y && !temp[2] && this.y + 1 != 11) {
                this.y += 1;
                System.out.printf("1.1 %s\n", this.getClass().getSimpleName());
                return;
            } else if (this.y > coordinates.y && !temp[3] && this.y - 1 != 0) {
                this.y -= 1;
                System.out.printf("1.2 %s\n", this.getClass().getSimpleName());
                return;
            }
            if (this.x <= coordinates.x && !temp[0]&& this.x + 1 != 11) {
                this.x += 1;
                System.out.printf("1.3 %s\n", this.getClass().getSimpleName());
                return;
            } else if (this.x >= coordinates.x && !temp[1]&& this.x - 1 != 0) {
                this.x -= 1;
                System.out.printf("1.4 %s\n", this.getClass().getSimpleName());
                return;
            }
        }
    }

    public boolean[] checkPos(ArrayList<BaseHero> friends) {
        boolean[] temp = new boolean[4];
        for (BaseHero u : friends) {
            if ((u.coordinata.x == this.x + 1) && (u.coordinata.y == this.y))
                temp[0] = true;
            if ((u.coordinata.x == this.x - 1) && (u.coordinata.y == this.y))
                temp[1] = true;
            if ((u.coordinata.x == this.x) && (u.coordinata.y == this.y + 1))
                temp[2] = true;
            if ((u.coordinata.x == this.x) && (u.coordinata.y == this.y - 1))
                temp[3] = true;
        }
        return temp;
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
    



    

    

}
