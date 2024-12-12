package Inheretance;

public class BankAccount {
	private long accountNo;
	private double balance;
	public BankAccount(long accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposite "+amount+" int to"+accountNo);
	}
	public void withdraw(double amount) {
		if(amount>=amount) {
			balance=balance-amount;
			System.out.println("withdraw"+amount+"from"+accountNo);
		}else{
			System.out.println("Insufficient balance");
		}
	}		
}
