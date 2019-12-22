package day21;



public class SearchSomethingInString3 {
    public static void main(String[] args) {

        String myName="Amelia Amelia Behlia";
        int length=myName.length();
          int count=0;
        for (int i = 0; i <=length-3 ; i++) {
            String currentName=myName.substring(i,i+3);
            if(currentName.equalsIgnoreCase("lia")){
                count++;
            }

        }
        System.out.println(count);





    }
}
