package ConditionalStatements;
// password strength checker
import java.util.Scanner;
public class Example10 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the password");
		String s1=s.nextLine();
		if(s1.length()>8) {
			System.out.println("strong password");
		}else if(s1.length()==8) {
			System.out.println("normal");
		}else {
			System.out.println("weak");
		}
	}
}
