package com.scci.cls;

public class Account {
	AccountHolder accHolder;
	int balance;
	public Account(AccountHolder accHolder, int balance) {
		this.accHolder = accHolder;
		this.balance = balance;
	}
	// 출금
	// withdraw 함수는 예외를 던지는 함수.
	// 함수 파라미터 자리 뒤에 throws Exception 구문이 들어간 의미는
	// 이 함수는 해당 예외를 던질 수 있다는 의미
	// 예외처리 : 예외가 발생 했을 때 실행(흐름)을 제어 하는 것
	public int withdraw(int money) throws Exception {
		if ( this.balance - money < 0 ) {
			// 예외를 던진는 구문
			throw new Exception("balance not enough" + this.balance);
		}
		this.balance = this.balance - money;
		return money;
	}
	// 예금
	public void deposit(int money) {
		this.balance = this.balance + money;
	}
	
	public String getInfo() {
		// accHolder의 name 필드(인스턴스 변수)를 직접 접근하지 못한 이유는
		// private으로 접근지시자가 지정 되어 있어서, 해당 클래스(AccountHolder) 외부에서는 접근이 불가능
		return accHolder.getName() + " " + balance; 
	}
}
