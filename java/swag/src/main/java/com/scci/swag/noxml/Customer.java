package com.scci.swag.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="customer")
public class Customer {

    private int type;
    private Person person;

    public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Customer() {
    }

    @Autowired
    public Customer(Person person) {
        this.person = person;
    }
}