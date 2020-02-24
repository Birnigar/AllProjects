package Repl_It;

public class Repl_176 {
    public static void main(String[] args) {


    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

        return isAvailable && (month!=7 || !(day>=1 && day<=8)) && year==2018;
    }
}