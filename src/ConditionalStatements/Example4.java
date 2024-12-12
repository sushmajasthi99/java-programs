package ConditionalStatements;
// calucate marks grade
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
		int n=s.nextInt();
		if(n>=90) {
			System.out.println("A grad");
		} else if(n>=70) {
			System.out.println("B grad");
		} else if(n>=60) {
			System.out.println("C grad");
		}
	}
}
