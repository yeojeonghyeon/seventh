package com.scci.inheritance;

public class Shape {
	private float height;
	private float width;
	public Shape(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public float getArea() {
		return height*width;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	// protected 같은 패키지 내부에서 접근 가능, 다른 패키지의 서브클래스에서 접근 가능(Shape 클래스를 상속받는 클래스라면)
	protected float getHeight() {
		return height;
	}
	protected float getWidth() {
		return width;
	}
}
// Shape 클래스를 상속
class Rectangle extends Shape{
	private boolean isSameWidthHeight;
	public Rectangle(int height, int width, boolean isSameWidthHeight) {
		super(height, width); // Shape의 생성자 함수를 먼저 호출
		this.isSameWidthHeight = isSameWidthHeight;
	}
	public String getWidthHeight() {
		return getHeight() +" "+ getWidth();
	}
}
class Square extends Shape{
	public Square(int eachSide){
		super(eachSide, eachSide);
	}
}
