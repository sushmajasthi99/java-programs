package ConditionalStatements;

import java.util.Scanner;
public class Example6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=s.nextInt();
		if(n%4==0 || n%100==0 && n%400==0) {
			System.out.println("leap year");
		}else {
			System.out.println("not a year");
		}
	}
}
