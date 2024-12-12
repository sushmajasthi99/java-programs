package ConditionalStatements;
import java.util.*;
// Even or Odd Number
public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}
}
