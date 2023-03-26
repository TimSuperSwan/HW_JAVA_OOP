package Units;

import java.util.ArrayList;

public interface Actions {

    void step(ArrayList<BaseHero> enemies, ArrayList<BaseHero> friends);

    void attack(BaseHero enemiy);

    String getInfo();

}
