import java.util.ArrayList;

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

    }
}