package com.scci.inheritance;

public class InkjetPrinter extends Printer {
	private boolean isColorful;
	public InkjetPrinter(String modelName, String manufacturer, String serialNo, int dpi, boolean is110v, boolean isColorful) {
		super(modelName, manufacturer, serialNo, dpi, is110v);
		this.isColorful = isColorful;
	}
	// 부모에 있는 print 함수를 재정의
	@Override
	public void print(String contents) {
		if ( isColorful ) {
			System.out.println("colorful print : " + contents);
		}else {
			System.out.println("mono print : " + contents);
		}
	}
}

class LaserPrinter extends Printer{
	private String tonerKind;
	private boolean isColorMode = true;
	public LaserPrinter(String modelName, String manufacturer, String serialNo, int dpi, boolean is110v, String tonerKind) {
		super(modelName, manufacturer, serialNo, dpi, is110v);
		this.tonerKind = tonerKind;
	}
	@Override
	public void print(String contents) {
		if ( isColorMode ) {
			System.out.println("Color Mode print : " + contents);			
		}else {
			System.out.println("mono Mode print : " + contents);				
		}
	}
}