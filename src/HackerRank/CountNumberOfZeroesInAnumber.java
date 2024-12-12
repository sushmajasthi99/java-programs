package HackerRank;

import java.util.Scanner;
public class CountNumberOfZeroesInAnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        if(n==0){
            System.out.println(1);
        }
        while(n>0){
            if(n%10==0){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
	}
}
