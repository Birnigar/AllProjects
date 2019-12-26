package day33;

public class MethodWithReturnPractice2 {
    public static void main(String[] args) {


        System.out.println(getDaysOfWeekFromNumber(5));
        System.out.println(getDaysOfWeekFromNumber(16));
        System.out.println(getDaysOfWeekFromNumber2(6));
        int[] allCodes={5,3,11,4,33};
        for (int eachCode:allCodes){
            System.out.println("day= "+getDaysOfWeekFromNumber2(eachCode));
        }

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

    public static String getDaysOfWeekFromNumber2(int dayCode){
        String[] daysArray={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String day="";
        if(dayCode>0 && dayCode<=7){
            day=daysArray[dayCode-1];
        }else{
            day="FUNDAY";
        }
        return day;
    }
}
