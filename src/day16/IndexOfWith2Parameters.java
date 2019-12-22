package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {
        //           01234567890123456789012345
        String name="I love Java I love Java Java Java";
        //get the second java from the sentences
        //assume you already know there are 4 java in this sentences
        //second java means----> the java showed up after first java
        //first find out where is location of the first java showed up
        //in order to  find second one
        //instead of searching from begining
        //search from right after the location you found first java
        // then it will give you the index of second java

        //BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        //BECAUSE INDEX OF ALWAYS START FROM BEGINING


        System.out.println( "starting from 0 "+ name.indexOf("Java"));
        System.out.println("starting from 7 " + name.indexOf("Java",7));
        System.out.println("starting from 8 " +name.indexOf("Java",8));
        System.out.println("starting from 9 " +name.indexOf("Java",9));
        System.out.println("starting from 19 " +name.indexOf("Java",19));
        System.out.println("starting from 20 " +name.indexOf("Java",20));

        System.out.println(name.indexOf("Java",25));






    }
}
