package day48;

public class Kangaroo implements Bouncible,BoxerWithBellyPouch{
    String name;
    int jumpDistance;

    public Kangaroo(String name,int jumpDistance){
        this.name=name;
        this.jumpDistance=jumpDistance;
    }

    @Override
    public void bounce() {
        System.out.println("Kangaroo is bouncible");
    }

    public void eat(){
        System.out.println("Kangaroo eats grass");
    }



    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name "+name+" is kickboxing");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo with name "+name+" is carrying a baby");
    }


    @Override
        public String toString() {
            return "Kangaroo{" +
                    "name='" + name + '\'' +
                    ", jumpDistance=" + jumpDistance +
                    '}';
        }

}
