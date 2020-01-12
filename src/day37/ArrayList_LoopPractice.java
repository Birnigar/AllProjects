package day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice {
    public static void main(String[] args) {


        ArrayList<String> teamMate=new ArrayList<>();
        teamMate.add("Seda");
        teamMate.add("Hakan");
        teamMate.add("Tugba");
        teamMate.add("Zeliha");
        teamMate.add("Ronnie");
        teamMate.add("Onuralp");
        teamMate.add("AyseGul");

String longestName=teamMate.get(0);
String longNames="";
        for (int i = 0; i <teamMate.size() ; i++) {
            if(teamMate.get(i).length()>longestName.length()){
               longestName=teamMate.get(i);

            }
        }
        for (int i = 0; i <teamMate.size() ; i++) {
            if(longestName.length()==teamMate.get(i).length()){
                longNames+=teamMate.get(i)+" ";
            }
        }
        System.out.println("longestName = " + longestName);
        System.out.println("longNames = " + longNames);

for (String eachName:teamMate){
    System.out.println("Current Name = "+ eachName);
}






    }
}
