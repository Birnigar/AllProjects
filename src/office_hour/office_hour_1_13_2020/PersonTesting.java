package office_hour.office_hour_1_13_2020;

public class PersonTesting {
    public static void main(String[] args) {

        Person person1=new Person();
        person1.firstName="Faruk";
        person1.lastName="Ozyurt";
        person1.DOB="11/06/2006";

        Person person2= new Person();
        person2.firstName="Furkan";
        person2.lastName="Ozyurt";
        person2.DOB="05/29/2014";

        Person person3= new Person();
        person3.firstName="Mujgan";
        person3.lastName="Ozyurt";
        person3.DOB="11/19/2004";

        person1.printInfo();
    }
}
