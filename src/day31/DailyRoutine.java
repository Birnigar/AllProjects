package day31;

public class DailyRoutine {
    public static void main(String[] args) {
        wakeUp();
      drinkCoffe();
      prepareKidsForSchool();
      takeThemSchool();
      studyJava();
      syaLoveJava300Times();
    }

    public static void wakeUp(){
        System.out.println("Open your eye,only one  ");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? open it again!");

    }
    public static void drinkCoffe(){
        System.out.println("Put coffee in your coffee machine");
        System.out.println("Press the button make your coffe");
        System.out.println("------------------");
    }
    public static void prepareKidsForSchool(){
        System.out.println("Kiss them up kids to wake them up");
        System.out.println("Wake them up for 10 times");
        System.out.println("Prepare their breakfast and lunch");
        System.out.println("Eat with them");
        System.out.println("-------------------");
    }
    public static void takeThemSchool(){
        System.out.println("Take them school bus ");
        System.out.println("Say good by");
        System.out.println("-------------");

    }
    public static void studyJava(){
        System.out.println("Think about java waking up ");
        System.out.println("Think about java drinking Coffee ");
        System.out.println("Think about java preparing Kids ForSchool ");
        System.out.println("Think about java taking Them To School ");
        System.out.println("Eventually sit down and study java , practice practice!!!");
        System.out.println("Review Last classes , come ready for the class");
        System.out.println("-----------------");

    }
    public static void syaLoveJava300Times(){
        for (int i = 0; i <=300 ; i++) {
            System.out.print(i+" i love java |");
        }
    }
}
