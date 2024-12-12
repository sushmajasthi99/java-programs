package ConditionalStatements;
import java.util.*;
//Positive or negative number
public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(n>0)
			System.out.println("+ve Number");
		else
			if(n<0)
			System.out.println("-ve Number");
		else
			System.out.println("Zero");
	}
}
