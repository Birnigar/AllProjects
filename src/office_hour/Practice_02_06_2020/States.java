package office_hour.Practice_02_06_2020;

public abstract class States {
String stateName;
    public  void tax(){
        System.out.println("Tax rate is %5");
    }
    public final void method1(){
        System.out.println("Method1 from State");
    }


}


class Kentucky extends States{
String stateName="KY";

    public void tax() {
        System.out.println("Tax Rate in KY is 6%");
    }
    public void KFC(){
        System.out.println("KY has KFC");
    }

    public final void method1(int a){
        System.out.println("Method1 from Kentucky");
    }




}

class California extends States{
String stateName="CA";

    public void tax() {
        System.out.println("Tax Rate in California is 9%");
    }

    public void hollywood(){
        System.out.println("There is Hollywood in CA");
    }

    public final void method1(short a){
        System.out.println("Method1 from California");
    }
}