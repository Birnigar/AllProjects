package day27;

public class Multi_D_ArraysWithString {
    public static void main(String[] args) {
        
        String[] developersTeam={"Vladislav","Hasan","Tolkun"};
        String[]  testerTeam={"Zhibekchach","Mohammed Sohrabi","Nursultan"};
        String[]  businessAnalysitTeam={"Lisa","Ershad","Naila"};
        
        
        String[][] scrumTeam={developersTeam,testerTeam,businessAnalysitTeam};
        
        int maxLenght=scrumTeam[0][0].length();
        String maxElement="";
        for (String[] each1DArray:scrumTeam){
            for (String eachElement:each1DArray){
                if(eachElement.length()>maxLenght){
                    maxLenght=eachElement.length();
                    maxElement=eachElement;
                }
            }
        }
        System.out.println("maxElement = " + maxElement);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
