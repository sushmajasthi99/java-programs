package Loops;
// reverse of a number
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int rem=0;
		int rev=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);	
		}
	}