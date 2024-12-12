package HackerRank;

import java.util.Scanner;
public class HammingWeight1 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int count=0;
	           while(n>0){
	               count+=n%2;
	                   n=n/2;
	               }
	               System.out.println(count);
	}
}
