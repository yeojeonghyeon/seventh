package com.scci.cls;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new Account(new AccountHolder("smith", "suncheon", "01012345678"), 10000);
		Account acc2 = new Account(new AccountHolder("david", "yeosu", "01078901234"), 20000);
		
		acc1.deposit(3000);
		// 예외 처리기 : 예외가 발생 했을 때 어떻게 처리 할 것인가 ( 흐름을 어떻게 제어 할 것인가 )
		// try 블럭 안에서 예외가 발생하면 
		// catch 문으로 제어(흐름)가 이동하고, 발생한 예외와 같으면
		// catch block으로 실행이 이동
		try {
			acc2.withdraw(5000);
			acc1.withdraw(13100);
			System.out.println(11111111);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		ArrayList<Account> lst = new ArrayList<Account>();
		lst.add(acc1);
		lst.add(acc2);
		
		Main.showFiltered(lst, 10000);
	}
	public static void showFiltered(ArrayList<Account> src, int filter) {
		for(Account acc : src) {
			if ( acc.balance >= filter ) {
				System.out.println(acc.getInfo());
			}
		}
	}
}
