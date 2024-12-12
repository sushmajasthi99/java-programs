package Loops;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;i<n-i-1;j++) 
				System.out.print(" ");
				int res=1;
				for(int j=0;j<=i;j++) {
					System.out.print(res+" ");
					res=res*(i-j)/(j+1);
				}
				System.out.println();
					
				}
			}
}