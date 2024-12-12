package Oops;

public class Rectangle {
	// Class definition for Rectangle
	    // Private instance variables
	    private double length;
	    private double width;

	    // Constructor to initialize length and width
	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    // Getter for length
	    public double getLength() {
	        return length;
	    }

	    // Setter for length
	    public void setLength(double length) {
	        if (length > 0) {
	            this.length = length;
	        } else {
	            System.out.println("Length must be positive.");
	        }
	    }

	    // Getter for width
	    public double getWidth() {
	        return width;
	    }

	    // Setter for width
	    public void setWidth(double width) {
	        if (width > 0) {
	            this.width = width;
	        } else {
	            System.out.println("Width must be positive.");
	        }
	    }

	    // Method to calculate the area of the rectangle
	    public double calculateArea() {
	        return length * width;
	    }

	    // Method to calculate the perimeter of the rectangle
	    public double calculatePerimeter() {
	        return 2 * (length + width);
	    }
	// Main class
	    public static void main(String[] args) {
	        // Create a Rectangle object
	        Rectangle rectangle = new Rectangle(10, 5);

	        // Display initial values
	        System.out.println("Initial Length: " + rectangle.getLength());
	        System.out.println("Initial Width: " + rectangle.getWidth());

	        // Update the length and width
	        rectangle.setLength(15);
	        rectangle.setWidth(7);

	        // Display updated values
	        System.out.println("Updated Length: " + rectangle.getLength());
	        System.out.println("Updated Width: " + rectangle.getWidth());

	        // Calculate and display area and perimeter
	        System.out.println("Area: " + rectangle.calculateArea());
	        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	    }
	}