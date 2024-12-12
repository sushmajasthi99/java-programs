package HackerRank;

import java.util.Scanner;
public class SumOfRowsAndColumnsPattern {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int m=s.nextInt();
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=m;j++){
	                 System.out.print((i + j) + " ");
	            }
	            System.out.println();
	        }
	}
}