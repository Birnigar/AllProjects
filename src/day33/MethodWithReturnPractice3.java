package day33;

public class MethodWithReturnPractice3 {
    public static void main(String[] args) {

        System.out.println("Age :"+calculateAndReturnAge(1979));
int[] birthYearArrays={1999,122,2019, 1987, 1978,1964,3999, 2004};
for (int eachYear:birthYearArrays){
    System.out.println("Age = "+calculateAndReturnAge(eachYear));
}


    }
public static long calculateAndReturnAge(int birthYear) {
    int currentYear = 2019;
    int age;
    if (birthYear > 1900 && birthYear < 2020) {
        age = currentYear - birthYear;
    }else {
        age=0;
    }
return age;

}
}
