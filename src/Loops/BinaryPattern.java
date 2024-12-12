package Loops;

// binary pattern
import java.util.Scanner;
public class BinaryPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		int m=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i+j) %2==0){
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
