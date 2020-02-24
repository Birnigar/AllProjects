package day52;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        List<Book> library=new ArrayList<>();
        library.add(new PaperBook("Lean in","Sherly Sandberg",4));
        library.add(new PaperBook("A Brief History of Time","Stephen Hawking",7));
        library.add(new PaperBook("The Power of Habit ","Charles Duhingg",5));

        int count=0;
        for (Book eachBook : library) {
            eachBook.displayBookInfo();
            if(eachBook.getClass().getSimpleName().equals("PaperBook")){
                count++;
            }
        }
        System.out.println("Count of paper books: "+count);
    }
}
