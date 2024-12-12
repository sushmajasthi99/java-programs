package ConditionalStatements;
// triangle exists or not
import java.util.Scanner;
public class Example7 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first side");
		int a=s.nextInt();
		System.out.println("Enter the second side");
		int b=s.nextInt();
		System.out.println("Enter the third side");
		int c=s.nextInt();
		if(a+b>c && b+c>a && c+a>b) {
			System.out.println("Trianglr exists");
		}else {
			System.out.println("Triangle doesn't exists");
		}	
	}
}
