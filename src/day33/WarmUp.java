package day33;

public class WarmUp {
    public static void main(String[] args) {

     //  String spelledName=getSpelledName("Nigar");
     //   System.out.println("spelledName = " + spelledName);
      //  System.out.println(getSpelledName("Mujgan"));

        System.out.println(getSpelledName2("Faruk"));
    }

  /* public static String getSpelledName(String name){
        String result="";
        for (int i = 0; i <name.length() ; i++) {
           result=result+name.charAt(i);

            if(i !=name.length()-1){
                result=result+"-";
            }

        }
        return result;
    }

   */
    public static String getSpelledName2(String name){
        String result="";
        for (int i = 0; i <name.length()-1 ; i++) {
            result=result+name.charAt(i)+"-";
        }

        result+=name.charAt(name.length()-1);



        return result;
    }


}
