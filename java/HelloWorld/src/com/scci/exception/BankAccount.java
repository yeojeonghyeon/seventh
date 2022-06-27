package com.scci.exception;

// public class 소스파일 하나에 하나만 선언 할 수 있음.
public class BankAccount {
	private AccountHolder owner;
	long balance;
	public BankAccount(AccountHolder owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public long withdraw(long amount) throws BalanceNotEnoughException {
		if (balance - amount >= 0) {
			throw new BalanceNotEnoughException("잔액이 부족합니다");
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

	public BalanceNotEnoughException(String message, long balance) {
		// super, 상속받은 Exception 클래스의 생성자를 호출
		super(message); // Exception 클래스의 생성자 함수
	}
	@Override
	public String getMessage() {
		return super.getMessage() + " 잔액:" + balance;
	}
}
