package day19;

public class MonkeySongWithWhileLoop {
    public static void main(String[] args) {
        int x=5;
        while (x>0){
            System.out.println(x + " little monkeys jumping on the bed "+"\n"+
                    "One fell off and bumped his head"+"\n"+
                    "Mama called the doctor"+"\n"+
                    "And the doctor said,"+"\n"+
                    "No more monkeys jumping on the bed");
            System.out.println();
            --x;
        }

    }
}
