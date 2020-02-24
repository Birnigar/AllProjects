package day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        //What if we want to multiple value for one key
        //group name --group members names
        //  String        List<String>


        Map<String,List<String>> groups=new HashMap<>();
            groups.put("PowerOf",Arrays.asList("Furkan","Daria","Serife","Muge"));
            groups.put("Achievers",Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like"));
            groups.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
            groups.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));



         groups.forEach((groupCode,allMembers) -> System.out.println("groupCode = " + groupCode +
                 " allMembers = "+allMembers));


        System.out.println(groups.get("Achievers").get(3));


        for (Map.Entry<String, List<String>> each : groups.entrySet()) {
            for (int i = 0; i <each.getValue().size() ; i++) {
                if(each.getValue().get(i)=="Toyly"){

                    System.out.println(" Toyly index = "+each.getKey()  +" "+ i);

            }
            }
        }


    }


}
