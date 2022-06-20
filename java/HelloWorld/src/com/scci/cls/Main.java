package com.scci.cls;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new Account(new AccountHolder("smith", "suncheon", "01012345678"), 10000);
		Account acc2 = new Account(new AccountHolder("david", "yeosu", "01078901234"), 20000);
		
		ArrayList<Account> lst = new ArrayList<Account>();
		lst.add(acc1);
		lst.add(acc2);
		
		Main.showFiltered(lst, 15000);
	}
	public static void showFiltered(ArrayList<Account> src, int filter) {
		for(Account acc : src) {
			if ( acc.balance >= filter ) {
				acc.showInfo();
			}
		}
	}
}
