package day51.polymorphim;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {


        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();



//        s1.draw();
//        s2.draw();
//        s3.draw();


    Shape[] allShapes={s1,s2,s3,new Triangle(),s2};

       for (Shape each:allShapes){
           each.draw();
       }

  List<Shape> allShape=new ArrayList<>(Arrays.asList(s1,s2,s3,s1));

        for (int i = 0; i <allShape.size() ; i++) {
            allShape.get(i).draw();
        }







    }







}
