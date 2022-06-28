package com.scci.inheritance;

public class Printer {
	private String modelName;
	private String manufacturer;
	private String serialNo;
	private int dpi;
	private boolean is110v;
	public Printer(String modelName, String manufacturer, String serialNo, int dpi, boolean is110v) {
		super();
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.serialNo = serialNo;
		this.dpi = dpi;
		this.is110v = is110v;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public int getDpi() {
		return dpi;
	}
	public void setDpi(int dpi) {
		this.dpi = dpi;
	}
	public boolean isIs110v() {
		return is110v;
	}
	public void setIs110v(boolean is110v) {
		this.is110v = is110v;
	}
	
	public void print(String contents) {
		System.out.println("Printer class's print : "+contents);
	}
	public String getInfo() {
		return modelName + " " + manufacturer + " " + serialNo;
	}
}
