package Loops;
// factorial number
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		int fact=1;
		while(n>=1) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);	
		}
	}