package com.scci.pkg;
import com.scci.cls.Account;

public class Main {
	Account acc;
	Child c;
	Parent p;
	
	String getInfo() {
		p.id = "1234";
		return c.getInfo();
	}
}
