package day08;

public class MultiBranchIfStatetment {
    public static void main(String[] args) {

        //pseudo|sudo code
        /*given currentSpeed ,speed limit
        *check whether the current speed id
        *
        * more than 90
        * more than 80 and less than90 --.reckless driving
        * more than 70 and less than 80 -->point taken
        * more than 60 less than 70---> warning
        * if not speeding keep driving
         */
        int currentSpeed=555;

        if (currentSpeed>70 ){
            System.out.println("you are speeding more than 70--POINTS TAKEN!!!");
            //asking whether it's less than or equal 70 than 60
            // when then come to this point , your speed is already not more than 70
        }else if(currentSpeed>60){
            System.out.println("your speed is less than or equal 70 than 60");
        } else {
            System.out.println("KEEP DRIVING YOU ARE GOOD");
        }







    }



}
