import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Units.*;


public class Program {

    public static final int unitsNumber = 10;
    public static void main(String[] args) {
        Random r = new Random();

        
        ArrayList<BaseHero> firstTeam = new ArrayList<>();
        ArrayList<BaseHero> secondTeam = new ArrayList<>();

        for (int i = 0; i < unitsNumber; i++) {
            int y = i;
            switch (r.nextInt(4)) {
                case 0:
                    firstTeam.add(new Archer(BaseHero.generateName(),0, y));
                    break;
                case 1:
                    firstTeam.add(new Magic(BaseHero.generateName(),0,y));
                    break;
                case 2:
                    firstTeam.add(new Peasant(BaseHero.generateName(),0, y));
                    break;
                default:
                    firstTeam.add(new Robber(BaseHero.generateName(),0,y));
                    break;
            }
            switch (r.nextInt(4)) {
                case 0:
                    secondTeam.add(new Crossbowman(BaseHero.generateName(),9,y));
                    break;
                case 1:
                    secondTeam.add(new Monk(BaseHero.generateName(),9,y));
                    break;
                case 2:
                    secondTeam.add(new Peasant(BaseHero.generateName(),9,y));
                    break;
                default:
                    secondTeam.add(new Spearman(BaseHero.generateName(),9,y));
                    break;
            }

        }
        System.out.println("__________________Команда2_________________________________");
       for (int i = 0; i < 10; i++) {
            System.out.println(secondTeam.get(i).toString() + "___" + secondTeam.get(i).getInfo());
       }
    //    System.out.println("____________________Команда1_______________________________");
    //    for (int i = 0; i < 10; i++) {
    //     System.out.println(firstTeam.get(i).toString() + "___" + firstTeam.get(i).getInfo());
        
//    }
        

        
        // firstTeam.forEach(h -> h.step(secondTeam, firstTeam));
        
        BaseHero Vasia = new Archer("Вася", 0, 7);
        BaseHero Petia = new Archer("Петя", 9, 2);
        // System.out.println(Petia.toString());
        System.out.println(Vasia.toString());
       
        

        
        Vasia.step(secondTeam, secondTeam);

        System.out.println("__________________Команда2_________________________________");
       for (int i = 0; i < 10; i++) {
            System.out.println(secondTeam.get(i).toString() + "___" + secondTeam.get(i).getInfo());
       }

    }
    
    

    public static void SortingBySpeed(ArrayList<BaseHero> list1, ArrayList<BaseHero> list2){
        ArrayList<BaseHero> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        
        // System.out.println("До сортировки\n\n");
        // for (int index = 0; index < 20; index++) {
        //     System.out.println(list.get(index).getInfo());
        // }

        list.sort(new Comparator<BaseHero>(){
            @Override
            public int compare (BaseHero h1, BaseHero h2){
                if (h1.getSpeed()== h2.getSpeed()) {
                    return 0;
                }
                else if (h1.getSpeed() > h2.getSpeed()) {
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });

        // System.out.println("После сортировки\n\n");
        // for (int index = 0; index < 20; index++) {
        //     System.out.println(list.get(index).getInfo());
        // }
    }


}