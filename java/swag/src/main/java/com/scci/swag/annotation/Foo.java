package com.scci.swag.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="foo")
public class Foo {
	@Autowired
	private Zoo zoo;
	public Zoo getZoo() {
		return zoo;
	}
}
