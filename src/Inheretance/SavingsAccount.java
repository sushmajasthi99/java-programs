package Inheretance;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(long accountNo, double balance) {
		super(accountNo, balance);
	}
	@Override
	public void withdraw(double amount) {
		if(getBalance()-amount>=500) {
			super.withdraw(amount);
	   }else {
			System.out.println("cannot withdraw"+amount+"from account"+getAccountNo());
		}
	}

public static void main(String[] args) {
		BankAccount account = new BankAccount(123456789, 5000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Account balance: " + account.getBalance());

       
        SavingsAccount savingsAccount = new SavingsAccount(181424, 500.0);
        savingsAccount.deposit(200.0);
        savingsAccount.withdraw(50.0); 
        System.out.println("Savings account balance: " + savingsAccount.getBalance());
	}
}
