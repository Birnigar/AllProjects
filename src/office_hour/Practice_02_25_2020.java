package office_hour;

public class Practice_02_25_2020 {
    public static void main(String[] args) {

        String str1="java";
        System.out.println("line7 = " + str1);
        String str2="java";
        System.out.println("line9 = " + str2);
        str1="selenium";
        System.out.println("str1 after changed = " + str1);
        System.out.println("str2 after changed = " + str2);


        StringBuilder sb1=new StringBuilder("html");
        StringBuilder sb2=sb1;
        System.out.println("values of sb1 "+ sb1 +" values of sb2 " + sb2);
        sb1=new StringBuilder("cucumber");
        System.out.println("values of sb1 "+ sb1 +" values of sb2 " + sb2);

        StringBuilder sb3=new StringBuilder("jenkins");
        StringBuilder sb4=sb3;
        System.out.println("values of sb3 "+ sb3 +" values of sb4 " + sb4);
        sb3=sb3.reverse();
        System.out.println("values of sb3 "+ sb3 +" values of sb4 " + sb4);
        
        String word="apple";
        StringBuilder word2=new StringBuilder(word);
        word2=word2.reverse();

        System.out.println("word2 = " + word2);















    }
}
