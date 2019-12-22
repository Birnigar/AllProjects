package day23;

public class ForEachLoopLongString {
    public static void main(String[] args) {
        String[] word={"AdilFaruk","Mujgan","Furkan","Birnigar","Omer"};

        String longWord=word[0];
          int characterLongWord=word[0].length();
        for (int i = 1; i <word.length ; i++) {
            if(word[i].length()>word[0].length()){
                longWord=word[i];
                characterLongWord=word[i].length();
            }
        }
        System.out.println("longWord = " + longWord +" has "+characterLongWord+" character ");

        
    }
}
