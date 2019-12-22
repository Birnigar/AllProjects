package day15;

public class SubStringPractice {
    public static void main(String[] args) {
        //getting the part of the String out of another String

        //            0123456789012345
        String movie="Lord of The Ring";
        //I wanna to get the string word "of"from this movie
        String wordOf=movie.substring(5,7);
        System.out.println("word of= "+ wordOf);
//get the second word
         int startingPoint=movie.indexOf(" ")+1;
         int endingPoint=movie.length();

         String wordLordOf=movie.substring(0,7);
        System.out.println("word Lord Of = " + wordLordOf);
        String seconToLast=movie.substring(5);//if you provide only one parameter to substring method
        //it will just start from that location and get till the end
        System.out.println("seconToLast = " + seconToLast);



        String part1=movie.substring(12);
        System.out.println(part1);
        String part2=movie.substring(4,12);
        System.out.println(part2);
        String part3=movie.substring(0,4);
        System.out.println(part1+part2+part3);
        //            0123456789012345
       // String movie="Lord of The Ring";
         //Ring of The Java Lord

        System.out.println(part1+part2+" Java "+part3);

    }
}
