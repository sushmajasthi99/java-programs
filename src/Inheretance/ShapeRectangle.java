package Inheretance;

import java.util.Scanner;

public class ShapeRectangle extends Shap {
	public void Rectangle (double length,double width) {
		double area=length*width;
		System.out.println(area);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length");
		double length=sc.nextInt();
		System.out.println("enter the width");
		double width=sc.nextInt();
		Shap s=new ShapeRectangle();
		System.out.println("Area");
		s.getArea(length, width);	
	}
}
	