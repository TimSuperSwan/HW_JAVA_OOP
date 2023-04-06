import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import Units.*;

public class Init {
    public static void createTeams() {
        Random r = new Random();
        for (int i = 0; i < Program.unitsNumber; i++) {
            int y = i;
            switch (r.nextInt(4)) {
                case 0:
                    Program.firstTeam.add(new Archer(BaseHero.generateName(),1, y+1));
                    break;
                case 1:
                    Program.firstTeam.add(new Magic(BaseHero.generateName(),1,y+1));
                    break;
                case 2:
                    Program.firstTeam.add(new Peasant(BaseHero.generateName(),1, y+1));
                    break;
                default:
                    Program.firstTeam.add(new Robber(BaseHero.generateName(),1,y+1));
                    break;
            }
            switch (r.nextInt(4)) {
                case 0:
                    Program.secondTeam.add(new Crossbowman(BaseHero.generateName(),10,y+1));
                    break;
                case 1:
                    Program.secondTeam.add(new Monk(BaseHero.generateName(),10,y+1));
                    break;
                case 2:
                    Program.secondTeam.add(new Peasant(BaseHero.generateName(),10,y+1));
                    break;
                default:
                Program.secondTeam.add(new Spearman(BaseHero.generateName(),10,y+1));
                    break;
            }
        }
    }

    public static void step() {
        ArrayList<BaseHero> list = new ArrayList<>();

        list.addAll( Program.secondTeam);
        list.addAll( Program.firstTeam);
        list.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero u1, BaseHero u2) {
                if (u1.getSpeed() == u2.getSpeed()) {
                    return 0;
                } else if (u1.getSpeed() > u2.getSpeed()) {
                    return 1;
                } else
                    return -1;
            }
        });

        for (BaseHero unit : list) {
            if ( Program.secondTeam.contains(unit)) {
                unit.step( Program.firstTeam,  Program.secondTeam);
            } else
                unit.step( Program.secondTeam,  Program.firstTeam);
        }
    }
}