package Assignment2;

import java.util.Scanner;

public class BankAccount {
	
	
	private String accountNo;
	private double balance;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public BankAccount(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	
	
	Scanner scanner=new Scanner(System.in);
	
	public void deposite() {
		System.out.println("Enter the deposite amount :");
		double amount=scanner.nextDouble();
		
		balance=balance+amount;
		System.out.println("******** Deposite successfully***********");
		
	}
	
	
	public void withdrawal() {
		System.out.println("Enter the withdrawal amount :");
		double withdrow=scanner.nextDouble();
		if (withdrow<balance) {
			
			balance=balance-withdrow;
			System.out.println("******** withdrawal successfully***********");
			
		}
		else {
			System.out.println("Insuficant balance");
		}
		
		
	}
	
	public void displayBalance() {
		System.out.println("Balance : "+balance);
		
	}
	
	public static void main(String[] args) {
		
		BankAccount b=new BankAccount("234563242315", 10000);
		b.displayBalance();
		b.deposite();
		b.withdrawal();
		b.displayBalance();
	}

}


