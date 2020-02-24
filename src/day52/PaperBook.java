package day52;

public class PaperBook extends Book implements Readable {
    int weight;

    public PaperBook(String name, String author,int weight) {
        super(name, author);
        this.weight=weight;
    }


    @Override
    public void displayBookInfo() {
        System.out.println("Book's name is: "+name+
                ", and the author is: "+author
                +" and it weight "+weight+
                "this is a paper book");

    }

    public void read(){
        System.out.println("I am reading "+name);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {

    }

    @Override
    public void showTableOfContent() {

    }
}
