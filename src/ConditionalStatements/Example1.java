package ConditionalStatements;
// Eligible for vote or not
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		if(n>=18) {
		System.out.println("Eligible for vote");
		}else {
			System.out.println("Not eligible for vote");
		}
	}
}
