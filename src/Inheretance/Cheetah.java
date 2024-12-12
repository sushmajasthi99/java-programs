package Inheretance;

public class Cheetah extends Animal {
	    // Overriding move method to specify that Cheetah runs
	    public void move() {
	        System.out.println("The cheetah is running.");
	    }

	        // Main class to test the program
	        public static void main(String[] args) {
	            Animal animal = new Animal(); // Create Animal object
	            Cheetah cheetah = new Cheetah(); // Create Cheetah object

	            animal.move(); // Output: The animal is moving.
	            cheetah.move(); // Output: The cheetah is running.
	        }
	    }