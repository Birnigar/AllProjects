package office_hour.office_hour_01_21;

public class Teams {
    public static void main(String[] args) {


       BoaTeams team1=new BoaTeams();
       team1.teamName="Eagles";
       team1.teamSize=9;
       team1.teamType="UAT";
       team1.companyName="BOA";

       BoaTeams team2=new BoaTeams();
       team2.teamName="BugBusters";
       team2.teamSize=12;
       team2.teamType="Scrum Team";
       team2.companyName="BOA";

        ScrumTeam team3=new ScrumTeam();
        team3.standUp();
        team3.teamSize=10;


        BoaTeams team4=new BoaTeams();
        BoaTeams team5=new BoaTeams();
        BoaTeams team6=new BoaTeams();


        System.out.println("team4.companyName = " + team4.companyName);


    }
}
