package com.bank;

public class Client {

	public static void main(String[] args) {
		
		Account aa=new Account("1111");
		System.out.println(aa.getAccountNumber());
		aa.deposite(1500);
		aa.deposite(6000);
		aa.withdraw(200);
		System.out.println(aa.getBalance());
		System.out.println("_________________________________");
		Account aa1=new Account("2222");
		System.out.println(aa1.getAccountNumber());
		System.out.println(aa1.getBalance());
		
	}

}
