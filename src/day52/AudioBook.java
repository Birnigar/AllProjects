package day52;

public class AudioBook extends Book {
    double duration;

    public AudioBook(String name, String author,double duration) {
        super(name, author);
        this.duration=duration;
    }

    @Override
    public void displayBookInfo() {

    }

    public void listen(){
        System.out.println("I am listening " + name);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
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
