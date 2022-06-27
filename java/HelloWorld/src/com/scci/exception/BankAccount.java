package com.scci.exception;

// public class 소스파일 하나에 하나만 선언 할 수 있음.
public class BankAccount {
	private AccountHolder owner;
	long balance;
	// 생성자
	public BankAccount(AccountHolder owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public long withdraw(long amount) throws BalanceNotEnoughException {
		if (balance - amount < 0) {
			throw new BalanceNotEnoughException("balance is not enough!", balance);
		}
		balance = balance - amount;
		return amount;
	}
	public void deposite(long amount) {
		balance = balance + amount;
	}
	public String getInfo() {
		return owner.ownerName + " " + balance;
	}
}

class AccountHolder {
	String ownerName;
	String ownerId;
	String accountNo;
	// 생성자
	public AccountHolder(String ownerName, String ownerId) {
		this.ownerName = ownerName;
		this.ownerId = ownerId;
	}
}

class BalanceNotEnoughException extends Exception {
	private long balance;
	public BalanceNotEnoughException() {
		super();
	}
	// 생성자
	public BalanceNotEnoughException(String message, long balance) {
		// super, 상속받은 Exception 클래스의 생성자를 호출
		super(message); // Exception 클래스의 생성자 함수
		this.balance = balance;
	}
	@Override
	public String getMessage() {
		return super.getMessage() + " balance: " + balance;
	}
}
