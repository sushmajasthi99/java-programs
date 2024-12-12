package Oops;

public class Circle {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    public static double calculateArea(double radius){
	    double Area =3.14*radius*radius;
	    return Area;
	    }

	    public static double calculatePerimeter(double radius){
	    double perimeter=2*3.14*radius;
	    return perimeter;
	    }

	    public static void main(String[] args) {
	        Circle c = new Circle(10);
	        System.out.println(c.getRadius());
	        System.out.println("Area of The Circle: "+Circle.calculateArea(15));
	        System.out.println("Perimeter of the Circle: "+Circle.calculatePerimeter(25.0));
	    }
	}