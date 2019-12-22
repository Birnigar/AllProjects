package day31;

public class Voting {
    public static void main(String[] args) {
        votingAge(15);
votingAge(23);
votingAge(63);
int yourAge=12;
votingAge(yourAge
);


    }

    //this method has one parameter named age
    //whoever calling this method , need to provide a number
    //it will set the value of age into that number
    //the method parameter can be only accessible within the method
    public static void votingAge(int age){
       // int age=15;
        if(age>18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible");
        }
    }





}
