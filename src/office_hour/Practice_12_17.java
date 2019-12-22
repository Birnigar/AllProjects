package office_hour;

public class Practice_12_17 {
    public static void main(String[] args) {

        int number=6;
        String word="java";


        System.out.println(word);//java print something that in java's memory
        System.out.println("word");// display word

        System.out.println(number);// 6
        System.out.println(number+6);// 6+6=12
        System.out.println(number+""+6);
        int wordCount=word.length();//how many character we have
        System.out.println(wordCount);
        System.out.println("I have 6"+7);//i have 67
        System.out.println("I have 6"+1+2);//I have 612
        System.out.println("I have 6"+(4+5));//I have 69
        System.out.println((2+3)+(3+5));
//                           5  +  8    =13


        String book="Learn java in 1 day";
        System.out.println(book.length());

        System.out.println(book.charAt(0));
        System.out.println(book.indexOf(" "));
        System.out.println(book.substring(0,6));
        String name="Rabia";
        System.out.println(name.substring(2));


        String batch="Online";
        System.out.println(batch.toUpperCase().length());
















    }
}
