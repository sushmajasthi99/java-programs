package Loops;

import java.util.Scanner;

public class ConvertNumberToBinary {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the decimal");
		int n=s.nextInt();
		String binary="";
		int number =n;
		while(n>0) {
			int rem=n%2;
			binary=rem+binary;
			n=n/2;
		}
		if(binary.isEmpty()) {
			binary="0";
		}
		System.out.println(binary);
		}
	}