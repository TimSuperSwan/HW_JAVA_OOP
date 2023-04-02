import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Units.*;


public class Program {
    public static ArrayList<BaseHero> firstTeam = new ArrayList<>();
    public static ArrayList<BaseHero> secondTeam = new ArrayList<>();
    public static final int unitsNumber = 10;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Init.createTeams();

        while(true){
            ConsoleView.view();
            sc.nextLine();
            Init.step();
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

        // list.sort(new Comparator<BaseHero>(){
        //     @Override
        //     public int compare (BaseHero h1, BaseHero h2){
        //         if (h1.getSpeed()== h2.getSpeed()) {
        //             return 0;
        //         }
        //         else if (h1.getSpeed() > h2.getSpeed()) {
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
    
        //     }
        // });

        // System.out.println("После сортировки\n\n");
        // for (int index = 0; index < 20; index++) {
        //     System.out.println(list.get(index).getInfo());
        // }
    }


}