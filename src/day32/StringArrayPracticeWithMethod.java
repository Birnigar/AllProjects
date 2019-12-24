package day32;

public class StringArrayPracticeWithMethod {
    public static void main(String[] args) {
compare2arraySize(new String[]{"Sezgin","Senay","Astrit"},new String[]{
        "Araz"});



    }
    public static void compare2arraySize(String[] arr1, String[] arr2){

        if(arr1.length>arr2.length){
            System.out.println("array 1 has more item ");
        }else if(arr1.length<arr2.length){
            System.out.println("array 2 has more item");
        }else{
            System.out.println("array 1 and array 2 have same item");
        }
    }

}
