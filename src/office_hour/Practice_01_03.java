package office_hour;

public class Practice_01_03 {
    public static void main(String[] args) {



       FrequencyOfChars("CCAAABBBCCCC");


    }
public static String removeDuplicate(String word){
        String removeDup="";
    for (int i = 0; i <word.length() ; i++) {
        if(!removeDup.contains(String.valueOf(word.charAt(i)))){
            removeDup+=String.valueOf(word.charAt(i));
        }
    }
    return removeDup;
}
public static int frequency(String word,char a){

    int count=0;
    for (int i = 0; i <word.length() ; i++) {
        if(word.charAt(i)==a){
            count++;
        }
    }
        return count;

}public static void FrequencyOfChars(String str){
       String removeDup= removeDuplicate(str);



            for (int j = 0; j <removeDup.length() ; j++) {
                System.out.print(String.valueOf(removeDup.charAt(j))+frequency(str,removeDup.charAt(j)));
            }




    }





}
