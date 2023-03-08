import java.util.ArrayList;
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
            switch (r.nextInt(7)) {
                case 0:

                    firstTeam.add(new Archer("name"));
                    break;
                case 1:
                    firstTeam.add(new Crossbowman("name"));
                case 2:
                    firstTeam.add(new Magic("name"));
                case 3:
                    firstTeam.add(new Monk("name"));
                case 4:
                    firstTeam.add(new Peasant("name"));
                case 5:
                    firstTeam.add(new Robber("name"));
                default:
                    firstTeam.add(new Spearman("name"));
                    break;
            }
            switch (r.nextInt(7)) {
                case 0:
                    secondTeam.add(new Archer("name"));
                    break;
                case 1:
                    secondTeam.add(new Crossbowman("name"));
                case 2:
                    secondTeam.add(new Magic("name"));
                case 3:
                    secondTeam.add(new Monk("name"));
                case 4:
                    secondTeam.add(new Peasant("name"));
                case 5:
                    secondTeam.add(new Robber("name"));
                default:
                    secondTeam.add(new Spearman("name"));
                    break;
            }

        }
        System.out.println("Первая команда");
        for (int index = 0; index < 10; index++) {
            System.out.println(firstTeam.get(index).getInfo());
        }

        System.out.println( );
        System.out.println("Вторая команда");
        for (int index = 0; index < 10; index++) {
            System.out.println(firstTeam.get(index).getInfo());
        }

    }

}