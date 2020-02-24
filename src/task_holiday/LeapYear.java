package task_holiday;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("isLeapYear = " + isLeapYear(2020));


    }
    public static boolean isLeapYear(int year){
        return ( year>=0 && year<=9999) && (year %400==0 || (year%4 ==0 && year %100!=0))  ;
    }
}
