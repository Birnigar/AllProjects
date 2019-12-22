package day08;

public class MultiBranchIfStatetment02 {
    public static void main(String[] args) {


        int currentSpeed=55;

        if (currentSpeed>90 ){
            System.out.println("GO TO THE JAIL");
            //asking whether it's less than or equal 70 than 60
            // when then come to this point , your speed is already not more than 70
        }else if(currentSpeed<90 && currentSpeed>80) {
            System.out.println("RECKLESS DRIVING");
        }else if (currentSpeed<80 && currentSpeed>70){
            System.out.println("POINT TAKEN");
        } else if(currentSpeed<70 && currentSpeed>60){
            System.out.println("WARNING!!");
        } else
            System.out.println("KEEP DRIVING YOU ARE GOOD");








    }



}
