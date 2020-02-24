package day52.polymorphism;

public class ShapePolymorphism2 {
    public static void main(String[] args) {


// Circle s1=new Circle("penny",5);

    Shape s1=new Circle("penny",5);

    Shape s2=new Rectangle("Book",10,5);

    printAnyShapeArea(new Square("Bob",6));

       s1.draw();

       drawShape3Times(s1);
       drawShape3Times(s2);
       drawShape3Times(new Square("Bob",6));

}

public static void drawShape3Times(Shape obj){
      obj.draw();
      obj.draw();
      obj.draw();
}






public static void printAnyShapeArea(Shape anyShape){
        anyShape.calculateArea();
    System.out.println(anyShape.name+" 's area is = "+anyShape.area);
}






}
