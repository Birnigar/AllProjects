package day37;

import java.util.ArrayList;

public class TeamMateListPractice {
    public static void main(String[] args) {

        ArrayList<String> teamMate=new ArrayList<>();
        teamMate.add("Seda");
        teamMate.add("Hakan");
        teamMate.add("Tugba");
        teamMate.add("Nuran");
        teamMate.add("Zeliha");
        teamMate.add("Emma");
        teamMate.add("Ronnie");
        teamMate.add("Onuralp");
        teamMate.add("Maria");
        teamMate.add("Celal");

        System.out.print("teamMate = " + teamMate);
        System.out.println();
        System.out.println("First Item = " + teamMate.get(0));
        System.out.println("Last Item = " + teamMate.get(teamMate.size()-1));

        for (int i = teamMate.size()-1; i >=0 ; i--) {
            System.out.println("Item "+(i+1)+" = "+ teamMate.get(i));
        }
String teamMateStr="";
        for (int i = 0; i <teamMate.size() ; i++) {
            if(i!=teamMate.size()-1)
            teamMateStr+=teamMate.get(i)+"-";
            else {
                teamMateStr+=teamMate.get(i);
            }
        }
        System.out.println("teamMateStr = " + teamMateStr);

        for (int i = 0; i <teamMate.size()-2; i++){
            System.out.println("Printing every 2 items "+teamMate.get(i)+" "+teamMate.get(i+1));
        }
        for (int i = 0; i <teamMate.size()-1; i+=2){
            System.out.println("Printing only 2 items "+teamMate.get(i)+" "+teamMate.get(i+1));
        }


    }
}
