package day35;

public class StringIntoIntegerParsing {
    public static void main(String[] args) {
        //I have a employee ID:"FB-457";
        //give me the employee number and store it;

        String strNum="457";
        int num=Integer.parseInt(strNum);
        System.out.println("num = " + num);

        String empID="FB-457";//it has nonnumerical element
        //that's why we can not parseInt directly
        String[] strempId=empID.split("-");
        int id=Integer.parseInt(strempId[1]);
        System.out.println("id = " + id);

        String twoNumbers="100,600";
        String[] twoNumberArr=twoNumbers.split(",");
        int num1=Integer.parseInt(twoNumberArr[0]);
        int num2=Integer.parseInt(twoNumberArr[1]);
        int sum=num1+num2;
        System.out.println("sum = " + sum);

    }
}
