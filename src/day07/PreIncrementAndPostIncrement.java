package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {


        //increment a
        int apple=8;

        apple++;//increment by one
        System.out.println(apple);
        System.out.println( ++apple);

        int score=10;
        score++;
        System.out.println(score++);// post increment increased the value next time the variable show up .

                                    //when the variable show up  is 10, thats why is 11 ,not 12

        int  offer=50;
        System.out.println(++offer); //51
        System.out.println(offer++); //51 and ready to be 52 next time it shows up

        System.out.println(offer); //52
        System.out.println(--offer);//51
        System.out.println(offer--);//still 51 and ready to be 52 next time it shows up
        System.out.println(offer);//50









    }
}
