package Oops;

import java.util.Scanner;

public class BankAccount {
	private long accountNumber;
	private int accountBalance;
	
	public BankAccount(long accountNumber, int accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		if(accountBalance>0) {
		this.accountBalance = accountBalance;
		}
	}
	public void deposite(double amount) {
		if(amount>0) {
			this.accountBalance+=amount;
			System.out.println("Deposite"+amount);
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=this.accountBalance) {
			this.accountBalance-=amount;
			System.out.println("Withdraw"+amount);
		}
	}
	public static void main(String[] args) {
		BankAccount ba=new BankAccount(123456789,100000);
			System.out.println("AccountNumber"+"+ba.getAccountNumber");
			System.out.println("Balance:"+"Rs."+ba.getAccountBalance());
			
			ba.deposite(1000);
			System.out.println("Available Balance"+ba.getAccountBalance());
			ba.withdraw(1900.00);
			System.out.println("Balance Amount:");
			System.out.println(ba.getAccountBalance());
	
	}
}