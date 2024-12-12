package Loops;
// perfect number or not
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<10/2;i++) {
			if(n%n==0) {
				sum=sum+n;
			}
		}
		if(sum==n) {
			System.out.println("perfect number");
		}else {
			System.out.println("not perfect");
			}
		}
}