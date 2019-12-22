package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {

        String students="Abbos,Zulyar,Zhibek,Hasan,Muge,Orhan,Suzan";

        //spell the name of each person in this format
        //A-b-b-o-s...

        String[] nameArrays= students.split(",");

        System.out.println("eachStudents = " + Arrays.toString(nameArrays));
        for (int i = 0; i <nameArrays.length ; i++) {

            String name=nameArrays[i];
            System.out.println("Spelling " +i+" : "+ name);

            for (int j = 0; j < name.length(); j++) {
                System.out.print(name.charAt(j)+"-");

            }
            System.out.println();
        }













    }
}
