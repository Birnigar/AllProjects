package office_hour;

public class Practice_02_26_2020 {
    public static void main(String[] args) {

        System.out.println(reverse("Nigar23"));


    }

    /**
     * how to reverse a string without affecting special characters

     */

    public static String reverse(String str){
        char[] arr=str.toCharArray();

        for (int i = 0,j=arr.length-1; i <j; i++,j--) {
           while (Character.isLetterOrDigit(arr[i])){
                i++;
            }
            while (!Character.isLetterOrDigit(arr[j])){
               j--;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
      return  new String();
    }
}
