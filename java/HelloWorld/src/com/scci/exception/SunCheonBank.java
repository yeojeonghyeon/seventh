package com.scci.exception;

import java.util.ArrayList;
import java.util.Arrays;

public class SunCheonBank {
	public static void main(String[] args) {
		ArrayList<BankAccount> accList = new ArrayList<BankAccount>();
		accList.add(new BankAccount(new AccountHolder("hong", "12345"), 1000));
		accList.add(new BankAccount(new AccountHolder("lim", "678910"), 2000));
		// 아래와 같은 문장으로 초기화 가능
		//ArrayList<BankAccount> lst = new ArrayList<BankAccount>(Arrays.asList(new BankAccount(new AccountHolder("hong", "12345"), 1000),new BankAccount(new AccountHolder("lim", "678910"), 2000)));
		
		for(int i=0; i<accList.size(); i++) {
			BankAccount ba = accList.get(i);
			ba.deposite(1000000);
		}
		
		for(int i=0; i<accList.size(); i++) {
			BankAccount ba = accList.get(i);
			try {
				ba.withdraw(1100000);
			} catch (BalanceNotEnoughException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
