import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Units.*;

/*Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo(); 
Реализовать интерфейсs в абстрактном классе и в наследниках так, 
чтобы getInfo возвращал тип персонажа. Создать два списка в классе main. 
В кждый из списков добавить по десять экземнляров наследников BaseHero. 
Удалить ненужные методы из абстрактного класса, если такие есть. 
В main пройти по спискам и вызвать у всех персонажей getInfo. */

public class Program {
    public static void main(String[] args) {
        Random r = new Random();

        // Peasant peasant = new Peasant("Вася");
        // System.out.println(peasant.getInfo());

        // Monk monk = new Monk("Петя");
        // System.out.println(monk.toString());

        ArrayList<BaseHero> firstTeam = new ArrayList<>();
        ArrayList<BaseHero> secondTeam = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (r.nextInt(4)) {
                case 0:
                    firstTeam.add(new Archer(BaseHero.generateName()));
                    break;
                case 1:
                    firstTeam.add(new Magic(BaseHero.generateName()));
                    break;
                case 2:
                    firstTeam.add(new Peasant(BaseHero.generateName()));
                    break;
                default:
                    firstTeam.add(new Robber(BaseHero.generateName()));
                    break;
            }
            switch (r.nextInt(4)) {
                case 0:
                    secondTeam.add(new Crossbowman(BaseHero.generateName()));
                    break;
                case 1:
                    secondTeam.add(new Monk(BaseHero.generateName()));
                    break;
                case 2:
                    secondTeam.add(new Peasant(BaseHero.generateName()));
                    break;
                default:
                    secondTeam.add(new Spearman(BaseHero.generateName()));
                    break;
            }

        }

        SortingBySpeed(firstTeam, secondTeam);

        
        // System.out.println("Первая команда");
        // for (int index = 0; index < 10; index++) {
        //     System.out.println(firstTeam.get(index).getInfo());
        // }

        // System.out.println( );
        // System.out.println("Вторая команда");
        // for (int index = 0; index < 10; index++) {
        //     System.out.println(secondTeam.get(index).getInfo());
        // }


    }
    

    public static void SortingBySpeed(ArrayList<BaseHero> list1, ArrayList<BaseHero> list2){
        ArrayList<BaseHero> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        
        System.out.println("До сортировки\n\n");
        for (int index = 0; index < 20; index++) {
            System.out.println(list.get(index).getInfo());
        }

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

        System.out.println("После сортировки\n\n");
        for (int index = 0; index < 20; index++) {
            System.out.println(list.get(index).getInfo());
        }
    }


}