package day11;

public class SwitchPractice {

    public static void main(String[] args) {


        String targetOption="Ha";
        System.out.println("Please enter which room's light Do you want turn on");

       switch (targetOption){

           case "Bd":

               System.out.println("You have turned on bedroom's light");
               break;
           case "Lr":
               System.out.println("You have turned on livingroom's light");
               break;
           case "Ki":
               System.out.println("You have turned on kitchen's light");
               break;
           case "Ha":

               System.out.println("You have turned on hallway's light");
               break;
           default:
               System.out.println("WRONG OPTION");
       }




    }
}
