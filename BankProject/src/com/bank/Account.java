package com.bank;

public class Account {
	private String accountNumber;
	private double balance;
	
	public  Account(String  accountNumber) {
		this.accountNumber=accountNumber;
		this.balance=500;
	}
	
	public String getAccountNumber() {
		return accountNumber;
		
	}
	
	public double deposite(double balance) {
		if(balance>0)
			this.balance=this.balance+balance;
		else
			System.out.println("invalid input");
		return balance;
	}
	public double withdraw(double balance) {
		if(this.balance>balance)
			this.balance=this.balance-balance;
		else
			System.out.println("invalid inputtttt");
		return balance;
	}
	public double getBalance() {
		return balance;
		
	}
}
