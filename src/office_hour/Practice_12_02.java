package office_hour;

public class Practice_12_02 {
    public static void main(String[] args) {
        String item="Echo Dot (3rd Gen) Charcoal";
        //get ever what inside parenthesis

           int par1=item.indexOf('(');
            int par2=item.indexOf(')');

            String wordInsideParenthesis=item.substring(par1+1,par2);
        System.out.println(wordInsideParenthesis);
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);

//----------------------------------------------
    String letters="J%a^V**$A";
    //remove sembols, just Java stay

        letters=letters.replace("%","")
                        .replace("^","")
                        .replace("*","")
                        .replace("*","")
                        .replace("$","")
                        .toUpperCase();
        System.out.println("letters = " + letters);

    }
}
