package day11;

public class StringEquality {
    public static void main(String[] args) {

        String name="Rabia";// creating string
        String name2=new String("Rabia");
        String name3="Rabia";
         //using == methods
        System.out.println(name==name2);//input false
        System.out.println(name==name3);//input true

        //using equals methods
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));






    }
}
