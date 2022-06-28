package com.scci.inheritance;

public class InkjetPrinter extends Printer {
	private boolean isColorful;
	public InkjetPrinter(String modelName, String manufacturer, String serialNo, int dpi, boolean is110v, boolean isColorful) {
		super(modelName, manufacturer, serialNo, dpi, is110v);
		this.isColorful = isColorful;
	}
	// 부모에 있는 print 함수를 재정의
	// 함수 오버라이딩
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
	private boolean isColorMode;
	public LaserPrinter(String modelName, String manufacturer, String serialNo, int dpi, boolean is110v, boolean isColorMode) {
		super(modelName, manufacturer, serialNo, dpi, is110v);
		this.isColorMode = isColorMode;
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