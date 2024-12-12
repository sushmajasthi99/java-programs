package ConditionalStatements;

import java.util.Scanner;
public class Example8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the password");
		char ch=s.next().charAt(0);
		if(Character.isLetter(ch)) {
			System.out.println("its a character");	
		}else if(Character.isDigit(ch)) {
			System.out.println("its a digit");
		}else {
			System.out.println("its a special character");
		}
	}
}
