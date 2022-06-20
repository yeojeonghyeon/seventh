package com.scci.cls;

public class Account {
	AccountHolder accHolder;
	int balance;
	public Account(AccountHolder accHolder, int balance) {
		this.accHolder = accHolder;
		this.balance = balance;
	}
	// 출금
	public int withdraw(int money) throws Exception {
		if ( this.balance - money < 0 ) {
			throw new Exception("balance not enough" + this.balance);
		}
		this.balance = this.balance - money;
		return money;
	}
	// 예금
	public void deposit(int money) {
		this.balance = this.balance + money;
	}
}
