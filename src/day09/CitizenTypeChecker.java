package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        //create variable string citizenType
        //create variable with age value
        //if the age >65 assign value of citizenType to senior
        //if the age,65 assign value of citizenType to not senior


        String citizenType;
        int age=60;

    if(age>65){
        citizenType="Senior";
    }else{
        citizenType="Not Senior";
    }
        System.out.println("The citizen age is "+age+" and he is a "+citizenType);
    }
}
