package day33;

public class MethodWithReturnPractice2 {
    public static void main(String[] args) {


        System.out.println(getDaysOfWeekFromNumber(5));
        System.out.println(getDaysOfWeekFromNumber(16));


    }
    public static String getDaysOfWeekFromNumber(int dayCode){

   String dayName="";
      switch (dayCode) {
          case 1:
              dayName = "Monday";
              break;
          case 2:
              dayName = "Tuesday";
              break;
          case 3:
              dayName = "Wednesday";
              break;
          case 4:
              dayName = "Thursday";
              break;
          case 5:
              dayName = "Friday";
              break;
          case 6:
              dayName = "Saturday";
              break;
          case 7:
              dayName = "Sunday";
              break;
          default:
              dayName = "FUNDAY";

      }
              return dayName;

    }
}
