package office_hour;

public class Practice_12_02_02 {
    public static void main(String[] args) {

        String name = "Birnigar Ozyurt";
        //getting each character using charAt(Index)
        //generate sequential number 0---->10

        int x = 0;
        while (x<name.length()){
            System.out.println("index: "+x);
            System.out.println(name.charAt(x));
            ++x;
        }

    }
}