package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        String[] shows={"Orville","Gifted","Game of Throne","Flash","Arrow","Super Girl"};
        int showsCount=shows.length;
        System.out.println("showsCount = " + showsCount);

        for (int i = 0; i <showsCount ; i++) {
          // String currentShow=shows[i];
            //System.out.println(currentShow+" has character count : "+currentShow.length()); 1.way
            System.out.println(shows[i]+" has character :"+shows[i].length());//2.way
        }
        
        String myFavoriteShow=shows[0];
        System.out.println("myFavoriteShow = " + myFavoriteShow);
        System.out.println("My favorite show's character count: "+myFavoriteShow.length());

        
        
        
        
        
        
        
    }
}
