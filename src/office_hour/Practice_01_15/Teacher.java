package office_hour.Practice_01_15;

public class Teacher {
    private String name;
    private  int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void initializeFields(String name,int age){
     //   this.name=name;
       // this.age=age;
        setName(name);
        setAge(age);


    }

}
