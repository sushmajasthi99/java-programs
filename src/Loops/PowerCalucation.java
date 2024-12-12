package Loops;

import java.util.Scanner;

public class PowerCalucation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int x=s.nextInt();
		int result=1;
		for(int i=1;i<=x;i++) {
			result=result*n;
		}
		System.out.println(result);
	}
}