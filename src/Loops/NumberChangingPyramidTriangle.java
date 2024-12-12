package Loops;

import java.util.Scanner;

public class NumberChangingPyramidTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int number = 1;
	    // Number of rows in the pyramid
		         // Starting number
		        
		        // Loop through each row
		        for (int i = 1; i <= n; i++) {
		            // Loop to print numbers in each row
		            for (int j = 1; j <= i; j++) {
		                System.out.print(number+" ");
		                number++; // Increment the number
		            }
		            // Move to the next line after each row
		            System.out.println();
		        }
		    }
		}