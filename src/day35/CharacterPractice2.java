package day35;

public class CharacterPractice2 {
    public static void main(String[] args) {
        //get sum of the number inside the Array
        // optionaly do it method
        String str="A34B123C4X";

        System.out.println(sumOfNumberInString(str));



    }
    public static int sumOfNumberInString(String str){
        String num="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i)))
            num+=str.charAt(i);
        }
        String [] numArr=num.split("");
        int sum=0;
        for (int i = 0; i <numArr.length ; i++) {
            sum+=Integer.parseInt(numArr[i]);
        }
        return sum;
    }
}
