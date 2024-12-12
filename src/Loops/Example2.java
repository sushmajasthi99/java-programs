package Loops;
// Armstrong number or not
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		int rem=0;
		int sum=0;
		int temp=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong");
		}else {
			System.out.println(" Not Armstrong ");
		}	
	}
}