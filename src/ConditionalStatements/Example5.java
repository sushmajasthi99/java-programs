package ConditionalStatements;
// largest of three numbers
import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number a");
		int a=sc.nextInt();
		System.out.println("enter a number b");
		int b=sc.nextInt();
		System.out.println("enter a number c");
		int c=sc.nextInt();
		if(a>b) {
			System.out.println(" A greatest number");
		}else if(b>c){
			System.out.println("B greatest number");
		} else if(c>a) {
			System.out.println(" C greatest number");
		}
	}
}
