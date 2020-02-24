package day43_Constructur_StaticVariable;

public class Pet {
    String breed;
    String name;

    public Pet(){
        setName("Noname");
        setBreed("Unknown");
    }
    public Pet(String breed,String name){
        setBreed(breed);
        setName(name);

    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void speak() {

        //switch (type.toLowerCase()  ){
        switch (breed) {

            case "cat":
                System.out.println("MEOW");
                break;
            case "dog":
                System.out.println("WOOF");
                break;
            case "horse":
                System.out.println("NEIGH");
                break;
            case "cow":
                System.out.println("MOOO");
                break;
            default:
                System.out.println("UNKNOWN ANIMAL!");

        }


    }


}
