package day33;

public class MethodWithReturnPractice {
    public static void main(String[] args) {

        System.out.println(getSumFrom1ToX(51));
        System.out.println(buildEmail("Nigar","Ozyurt"));
        System.out.println(GOT_Email("Furkan Ozyurt"));
    }

    public static int getSumFrom1ToX(int x){
        int sum=0;
        for (int i = 0; i <=x ; i++) {
            sum+=i;
        }

        return sum;
    }

public static String buildEmail(String name,String lastName){
        //Jon Snow--->JSnow@NightWatch.com
        String email;
        email=name.charAt(0)+lastName+"@NightWAtch.com";
        return email;
}
public static String GOT_Email(String fullName){

       String part1=fullName.split(" ")[0];
       String part2=fullName.split(" ")[1];
       return part1.charAt(0)+part2+"@NightWAtch.com";
}






}
