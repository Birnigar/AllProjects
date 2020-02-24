package day44;

public class Person {


    public static String species;
    // static field : belong to the class (type itself)
    // there is only one copy of this value shared by all the objects
    // created out of this Person template|blue print
    private String name;
    private int age;
    // instance field : belong to the instance(object)
    // every Person object will get their own name and age
    // changing the value of one object does not affect another


    public Person(String name, int age) {
        this.name = name;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Person.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}