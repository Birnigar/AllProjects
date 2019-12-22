package office_hour;

public class Practice_11_25  {
    public static void main(String[] args) {
        String message="A BC";
        System.out.println("message = <" + message+">");
        String messageTrimmed=message.trim();

        System.out.println("messageTrimmed = <" + messageTrimmed+">");

    String msj="I LOVE JAVA";
    String msjTrimmed=msj.trim();
        System.out.println("msjTrimmed = <" + msjTrimmed+">");
//isEmpty=yourString.length()==0 ---> true
        String emptySpaces="       ";
        System.out.println("emptySpaces = <" + emptySpaces+">");

        String emptySpacesAfterTrimmed=emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is:  " + emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is empty  = " + emptySpacesAfterTrimmed.isEmpty());

        System.out.println("emptySpaces is blank or not ??= " + emptySpaces.isBlank());

        //indexOf--->give you location of the string you looking for inside another string
        //for example yourString.indexOf("abc")
        //copied from above so we can see what we have ---->String message=" I LOVE JAVA"

        int locationOfLove=msj.indexOf("LOVE");
        System.out.println("location Of word Love = " + locationOfLove);
        int lastIndexOfLetterA=msj.lastIndexOf("A");
        System.out.println("last Index Of Letter A = " + lastIndexOfLetterA);

         boolean msjContainsLove=msj.contains("LOVE");
        System.out.println("msj Contains Love = " + msjContainsLove);







    }




}
