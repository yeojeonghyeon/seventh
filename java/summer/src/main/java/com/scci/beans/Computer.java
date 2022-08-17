package com.scci.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Computer {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private String manufacture;
	private String serialNo;
	public Computer() {}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		logger.info("Computer's setManufacture : " + manufacture);
		this.manufacture = manufacture;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
}
