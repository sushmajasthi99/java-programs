package ConditionalStatements;

import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println("Enter the week value");
		int n=s.nextInt();
		if(n==1) {
			System.out.println("Monday");
		}else if(n==2){
			System.out.println("Tuesday");
		}else if(n==3) {
			System.out.println("wednesday");
		}else if(n==4) {
			System.out.println("thursday");
		}else if(n==5) {
			System.out.println("Friday");
		}else if(n==6) {
			System.out.println("Saturday");
		}else if(n==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("doesn't not exists");	
		}
	}
}
