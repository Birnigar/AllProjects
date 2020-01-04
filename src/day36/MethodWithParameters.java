package day36;

public class MethodWithParameters {
    public static void main(String[] args) {

addOneHundred(25);
int num=7;
addOneHundred(num);
addOneHundred1(25);
addOneHundred1(125);
addOneHundred1(num);
        System.out.println(num);
    }
    public static void addOneHundred(int x){

        System.out.println(x+100);

    }

    public static void addOneHundred1(int x){
               x=x+100;
        System.out.println(x);
    }







}


/**this is what happen at run time when you pass the value
 * public static void addOneHundred(){
 *       int x= new Integer(100);
 *         System.out.println(x+100);
 *     }
 *
 *
 *
 *
 */



