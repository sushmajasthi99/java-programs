package Loops;

import java.util.Scanner;

public class ReverseLeftHalfPyramidPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		    // Number of rows in the pyramid 
		        for (int i = 0; i < n; i++) {
		            // Print leading spaces
		            for (int j = 0; j < i; j++) {
		                System.out.print(" ");
		            }
		            // Print stars
		            for (int j = 0; j < n - i; j++) {
		                System.out.print("*");
		            }
		            // Move to the next line
		            System.out.println();
		        }
		    }
		}