package Loops;
//Sandglass Star Pattern
import java.util.Scanner;
public class SandGlass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(k=n;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=n;i>=1;i--) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(k=n;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
			}
		}
	}