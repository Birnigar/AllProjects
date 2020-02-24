package office_hour.Practice_02_10_2020;

public class Circle extends Object{
    /*
    Task2:
	create a class called circle:
			instance variables: radious
			override equals() method:
					returns true if the one circule' radius is same with another circle
	create a class called Test:
			create two objects of circle, one' radious is 3, the other' radius is 5
			verify if those two circles are equal
     */

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        Circle c1=(Circle)obj;

        return this.radius== c1.radius;
    }
}
