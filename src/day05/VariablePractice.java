package day05;

public class VariablePractice {
    public static void main(String[] args) {
        /* Block comment ,everything in between will be seen as comment

        usually by default for whole numbers: just use int
        usually by default for whole fractional numbers :just use double
        Is string part of Primitive types? : NOOO!!!!
        String is sequence of character
        */
        // age calculator
        //given birth year'please calculate the age

        int birthYear= 1979;
        int currentYear=2019;
        int age=currentYear-birthYear;
// I am born in year 1979, and I am 40 years old;
        System.out.println("I am born in year "+birthYear+", and I am " +age+" years old;");

        //Task 2: you are speeding today
        //speed limit is some number , and your current speed is this
        //generate this output : You are driving 10 mph more than speed limit


        int currentSpeed=80;
        int speedLimit=65;
        int overTheLimit=currentSpeed-speedLimit;

        System.out.println("You are driving "+overTheLimit+ " mph more than speed limit");


    }
}
