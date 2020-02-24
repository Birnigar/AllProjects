package office_hour.Practice_02_03_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalOne {
    public static void main(String[] args) {

        Testers t1=new Testers("Mujgan Ozyurt","Tester",7000);
        Testers t2=new Testers("Faruk Ozyurt","Tester",9500);


        Developers d1=new Developers("Fatma Dag","Developer",15000);
        Developers d2=new Developers("Ali Ak","Developer",17000);

        List<ScrumTeam> testerList=new ArrayList<>(Arrays.asList(t1,t2));
        List<ScrumTeam> developerList=new ArrayList<>(Arrays.asList(d1,d2));
        List<ScrumTeam> scrumTeamsList=new ArrayList<>();
        scrumTeamsList.addAll(testerList);
        scrumTeamsList.addAll(developerList);

        for (ScrumTeam eachEmployee:scrumTeamsList) {
            eachEmployee.employeeInfo();
        }
        List<String> d = (Arrays.asList("avalon","alpharetta"));
        List<String> c = new ArrayList<>(Arrays.asList("civan","demirr"));

    }
}
