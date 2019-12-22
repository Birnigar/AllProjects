package day27;

public class Multi_D_ArraysWithStringPractice {
    public static void main(String[] args) {
        
        String[] developersTeam={"Vladislav","Hasan","Tolkun"};
        String[]  testerTeam={"Zhibekchach","Mohammed Sohrabi","Nursultan"};
        String[]  businessAnalysitTeam={"Lisa","Ershad","Naila"};
        
        
        String[][] scrumTeam={developersTeam,testerTeam,businessAnalysitTeam};
        
      int minLength=scrumTeam[0][0].length();
      String shortestString=scrumTeam[0][0];


        for (int i = 0; i <scrumTeam.length ; i++) {
            for (int j = 0; j <scrumTeam[i].length ; j++) {
                if(minLength>scrumTeam[i][j].length()){
                    minLength=scrumTeam[i][j].length();
                    shortestString=scrumTeam[i][j];
                }
                
            }
            
        }

        System.out.println("shortestString = " + shortestString);
        
        
        
        
        
    }
}
