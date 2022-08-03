package com.scci.swag.pattern.bridge;


public class Rectangle extends Shape{
  protected Rectangle(Drawing drawing) {
    super(drawing);
  }

  @Override
  public void draw() {
    System.out.println("Rect draw extend");
  }
}