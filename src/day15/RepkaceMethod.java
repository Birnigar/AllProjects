package day15;

public class RepkaceMethod {
    public static void main(String[] args) {
        String message="I love Pumpkin , Pumpkin is FUN!";
       message= message.replace("Pumpkin","Java!");

        System.out.println(message);

      //what if I want to replace space from everwhere

        String message2="Happy Thanks Giving to All!!";
        message2=message2.replace("Thanks Giving","Thanksgiving");
        System.out.println(message2);
        message2=message2.replace("!!","!");
        System.out.println(message2);
        message2=message2.replace(" ","");
        System.out.println(message2);

        String message3="TOMORROW IS OFF NO!";
        message3=message3.replace(" NO","");


    }
}
